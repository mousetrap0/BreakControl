package co.kr.airport.line.service;

import java.util.List;
import java.util.Objects;
import co.kr.airport.bbs.dao.BbsDao;
import co.kr.airport.bbs.domain.Bbs;
import co.kr.airport.bbs.dto.param.BbsCountParam;
import co.kr.airport.bbs.dto.param.BbsListParam;
import co.kr.airport.bbs.dto.param.CreateBbsAnswerParam;
import co.kr.airport.bbs.dto.param.CreateBbsParam;
import co.kr.airport.bbs.dto.param.CreateReadCountParam;
import co.kr.airport.bbs.dto.param.UpdateBbsParam;
import co.kr.airport.bbs.dto.request.BbsListRequest;
import co.kr.airport.bbs.dto.request.CreateBbsRequest;
import co.kr.airport.bbs.dto.request.UpdateBbsRequest;
import co.kr.airport.bbs.dto.response.BbsListResponse;
import co.kr.airport.bbs.dto.response.BbsResponse;
import co.kr.airport.bbs.dto.response.CreateBbsResponse;
import co.kr.airport.bbs.dto.response.DeleteBbsResponse;
import co.kr.airport.bbs.dto.response.UpdateBbsResponse;
import co.kr.airport.line.dao.LineDao;
import co.kr.airport.line.domain.Line;
import co.kr.airport.line.dto.param.LineCountParam;
import co.kr.airport.line.dto.param.LineListParam;
import co.kr.airport.line.dto.request.LineListRequest;
import co.kr.airport.line.dto.response.LineListResponse;
import co.kr.airport.line.dto.response.LineResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LineService {

	private final LineDao dao;

	public LineService(LineDao dao) {
		this.dao = dao;
	}

	/* 게시글 조회 */
	public LineListResponse getLineList(LineListRequest req) {
		LineListParam param = new LineListParam(req);
		param.setPageParam(req.getPage(), 10);

		List<Line> lineList = dao.getLineSearchPageList(param);
		int pageCnt = dao.getLineCount(new LineCountParam(req));

		return new LineListResponse(lineList, pageCnt);
	}
	
	public LineResponse getLine(Integer seq, String readerId) {

		return new LineResponse(dao.getLine(seq));
	}
	
}






