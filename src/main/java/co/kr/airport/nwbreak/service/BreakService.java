package co.kr.airport.nwbreak.service;

import java.util.List;
import java.util.Objects;
import co.kr.airport.nwbreak.dao.NwBreakDao;
import co.kr.airport.nwbreak.domain.NwBreak;
import co.kr.airport.nwbreak.dto.param.NwBreakListParam;
import co.kr.airport.nwbreak.dto.request.BbsListRequest;
import co.kr.airport.nwbreak.dto.response.BbsListResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BreakService {

	private final NwBreakDao dao;

	public BreakService(NwBreakDao dao) {
		this.dao = dao;
	}

	/* 게시글 조회 */
	public BbsListResponse getBbsList(BbsListRequest req) {
		NwBreakListParam param = new NwBreakListParam(req);
		param.setPageParam(req.getPage(), 10);

		List<NwBreak> nwBreakList = dao.getBbsSearchPageList(param);
		int pageCnt = dao.getBbsCount(new BbsCountParam(req));

		return new BbsListResponse(nwBreakList, pageCnt);
	}

	/* 특정 글 */
	/* 조회수 수정 */
	public BbsResponse getBbs(Integer seq, String readerId) {
		// 로그인 한 사용자의 조회수만 카운팅
		if (!readerId.isEmpty()) {
			CreateReadCountParam param = new CreateReadCountParam(seq, readerId);
			Integer result = dao.createBbsReadCountHistory(param); // 조회수 히스토리 처리 (insert: 1, update: 2)
			if (result == 1) {
				Integer updatedRecordCount = dao.increaseBbsReadCount(seq); // 조회수 증가
			}
		}

		return new BbsResponse(dao.getBreak(seq));
	}

	/* 글 추가 */
	public CreateBbsResponse createBbs(CreateBbsRequest req) {
		CreateBbsParam param = new CreateBbsParam(req);
		dao.createBbs(param);
		return new CreateBbsResponse(param.getSeq());
	}

	/* 답글 추가 */
	public CreateBbsResponse createBbsAnswer(Integer parentSeq, CreateBbsRequest req) {
		Integer updatedRecordCount = dao.updateNwBreakStep(parentSeq);
		Integer bbsAnswerCount = dao.getBbsAnswerCount(parentSeq);
		// TODO - 예외처리
		if (!Objects.equals(updatedRecordCount, bbsAnswerCount)) {
			System.out.println("BbsService createBbsAnswer: Fail update parent bbs step !!");
			return null;
		}

		CreateBbsAnswerParam param = new CreateBbsAnswerParam(parentSeq, req);
		dao.createBbsAnswer(param);
		return new CreateBbsResponse(param.getSeq());
	}

	/* 글 수정 */
	public UpdateBbsResponse updateBbs(Integer seq, UpdateBbsRequest req) {
		Integer updatedRecordCount = dao.updateBbs(new UpdateBbsParam(seq, req));
		return new UpdateBbsResponse(updatedRecordCount);
	}

	/* 게시글 삭제 */
	public DeleteBbsResponse deleteBbs(Integer seq) {
		Integer deletedRecordCount = dao.deleteBbs(seq);
		return new DeleteBbsResponse(deletedRecordCount);
	}
}






