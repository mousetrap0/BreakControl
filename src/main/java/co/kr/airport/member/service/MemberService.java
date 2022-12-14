package co.kr.airport.member.service;

import co.kr.airport.jwt.JwtTokenUtil;
import co.kr.airport.member.dao.MemberDao;
import co.kr.airport.member.dto.param.CreateMemberParam;
import co.kr.airport.member.dto.request.JoinRequest;
import co.kr.airport.member.dto.request.LoginRequest;
import co.kr.airport.member.dto.response.JoinResponse;
import co.kr.airport.member.dto.response.LoginResponse;
import co.kr.airport.member.exception.MemberException;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberService {

	private final MemberDao dao;
	private final PasswordEncoder encoder;
	private final AuthenticationManager authenticationManager;

	private final JwtTokenUtil jwtTokenUtil;
	private final UserDetailsService userDetailsService;


	public MemberService(MemberDao dao, PasswordEncoder encoder,
		AuthenticationManager authenticationManager,
		JwtTokenUtil jwtTokenUtil,
		UserDetailsService userDetailsService) {
		this.dao = dao;
		this.encoder = encoder;
		this.authenticationManager = authenticationManager;
		this.jwtTokenUtil = jwtTokenUtil;
		this.userDetailsService = userDetailsService;
	}

	public HttpStatus checkIdDuplicate(String id) {
		isExistUserId(id);
		return HttpStatus.OK;
	}

	@Transactional
	public JoinResponse join(JoinRequest req) {

		saveMember(req);
		authenticate(req.getId(), req.getPwd());

		return new JoinResponse(req.getId());
	}

	private void saveMember(JoinRequest req) {
		// ????????? ?????? ??????
		isExistUserId(req.getId());

		// ???????????? ?????? ??????
		checkPwd(req.getPwd(), req.getCheckPwd());

		// ?????? ?????? ??????
		String encodedPwd = encoder.encode(req.getPwd());
		CreateMemberParam param = new CreateMemberParam(req, encodedPwd);

		Integer result = dao.createMember(param);
		if (result == 0) {
			throw new MemberException("?????? ????????? ??????????????????.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public LoginResponse login(LoginRequest req) {
		authenticate(req.getId(), req.getPwd());

		final UserDetails userDetails = userDetailsService.loadUserByUsername(req.getId());
		final String token = jwtTokenUtil.generateToken(userDetails);

		return new LoginResponse(token, req.getId());
	}

	private void authenticate(String id, String pwd) {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(id, pwd));
		} catch (DisabledException e) {
			throw new MemberException("???????????? ?????? ??????????????????.", HttpStatus.BAD_REQUEST);
		} catch (BadCredentialsException e) {
			throw new MemberException("??????????????? ???????????? ????????????.", HttpStatus.BAD_REQUEST);
		}
	}

	private void isExistUserId(String id) {
		Integer result = dao.isExistUserId(id);
		if (result == 1) {
			throw new MemberException("?????? ???????????? ??????????????????.", HttpStatus.BAD_REQUEST);
		}
	}

	private void checkPwd(String pwd, String checkPwd) {
		if (!pwd.equals(checkPwd)) {
			throw new MemberException("??????????????? ???????????? ????????????.", HttpStatus.BAD_REQUEST);
		}
	}
}




