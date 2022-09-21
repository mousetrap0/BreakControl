package co.kr.airport.nwbreak.service;

import java.util.List;
import java.util.Objects;

import co.kr.airport.nwbreak.dao.NwBreakDao;
import co.kr.airport.nwbreak.domain.NwBreak;
import co.kr.airport.nwbreak.dto.param.CreateNwBreakAnswerParam;
import co.kr.airport.nwbreak.dto.param.CreateNwBreakParam;
import co.kr.airport.nwbreak.dto.param.NwBreakCountParam;
import co.kr.airport.nwbreak.dto.param.NwBreakListParam;
import co.kr.airport.nwbreak.dto.param.UpdateNwBreakParam;
import co.kr.airport.nwbreak.dto.request.CreateNwBreakRequest;
import co.kr.airport.nwbreak.dto.request.NwBreakListRequest;
import co.kr.airport.nwbreak.dto.request.UpdateNwBreakRequest;
import co.kr.airport.nwbreak.dto.response.CreateNwBreakResponse;
import co.kr.airport.nwbreak.dto.response.DeleteNwBreakResponse;
import co.kr.airport.nwbreak.dto.response.NwBreakListResponse;
import co.kr.airport.nwbreak.dto.response.NwBreakResponse;
import co.kr.airport.nwbreak.dto.response.UpdateNwBreakResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NwBreakService {

	private final NwBreakDao dao;

	public NwBreakService(NwBreakDao dao) {
		this.dao = dao;
	}

	/* 게시글 조회 */
	public NwBreakListResponse getNwBreakList(NwBreakListRequest req) {
		NwBreakListParam param = new NwBreakListParam(req);
		param.setPageParam(req.getPage(), 10);

		List<NwBreak> nwBreakList = dao.getNwBreakSearchPageList(param);
		
		for(NwBreak nwbreak : nwBreakList) {
			long diff = nwbreak.getRecoveryTime().getTime() - nwbreak.getBreakTime().getTime();
			long min = diff / 60000;
			nwbreak.setFailTime(min);
		}
		
		int pageCnt = dao.getNwBreakCount(new NwBreakCountParam(req));

		return new NwBreakListResponse(nwBreakList, pageCnt);
	}

	/* 특정 글 */
	/* 조회수 수정 */
	public NwBreakResponse getNwBreak(Integer breakId, String readerId) {
		// 로그인 한 사용자의 조회수만 카운팅
	/*	if (!readerId.isEmpty()) {
			CreateReadCountParam param = new CreateReadCountParam(seq, readerId);
			Integer result = dao.createNwBreakReadCountHistory(param); // 조회수 히스토리 처리 (insert: 1, update: 2)
			if (result == 1) {
				Integer updatedRecordCount = dao.increaseNwBreakReadCount(seq); // 조회수 증가
			}
		}*/

		return new NwBreakResponse(dao.getNwBreak(breakId));
	}

	/* 글 추가 */
	public CreateNwBreakResponse createNwBreak(CreateNwBreakRequest req) {
		CreateNwBreakParam param = new CreateNwBreakParam(req);
		dao.createNwBreak(param);
		return new CreateNwBreakResponse(param.getBreakId());
	}

	/* 답글 추가 */
	public CreateNwBreakResponse createNwBreakAnswer(Integer parentSeq, CreateNwBreakRequest req) {
		Integer updatedRecordCount = dao.updateNwBreakStep(parentSeq);
		Integer NwBreakAnswerCount = dao.getNwBreakAnswerCount(parentSeq);
		// TODO - 예외처리
		if (!Objects.equals(updatedRecordCount, NwBreakAnswerCount)) {
			System.out.println("NwBreakService createNwBreakAnswer: Fail update parent NwBreak step !!");
			return null;
		}

		CreateNwBreakAnswerParam param = new CreateNwBreakAnswerParam(parentSeq, req);
		dao.createNwBreakAnswer(param);
		return new CreateNwBreakResponse(param.getBreakId());
	}

	/* 글 수정 */
	public UpdateNwBreakResponse updateNwBreak(Integer seq, UpdateNwBreakRequest req) {
		Integer updatedRecordCount = dao.updateNwBreak(new UpdateNwBreakParam(seq, req));
		return new UpdateNwBreakResponse(updatedRecordCount);
	}

	/* 게시글 삭제 */
	public DeleteNwBreakResponse deleteNwBreak(Integer seq) {
		Integer deletedRecordCount = dao.deleteNwBreak(seq);
		return new DeleteNwBreakResponse(deletedRecordCount);
	}

}






