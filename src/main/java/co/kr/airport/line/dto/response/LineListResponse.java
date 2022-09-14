package co.kr.airport.line.dto.response;

import java.util.List;
import co.kr.airport.line.domain.Line;

public class LineListResponse {

    private List<Line> lineList;
    private Integer pageCnt;

    public LineListResponse(List<Line> lineList, Integer pageCnt) {
        this.lineList = lineList;
        this.pageCnt = pageCnt;
    }

	public List<Line> getLineList() {
		return lineList;
	}

	public void setLineList(List<Line> lineList) {
		this.lineList = lineList;
	}

	public Integer getPageCnt() {
		return pageCnt;
	}

	public void setPageCnt(Integer pageCnt) {
		this.pageCnt = pageCnt;
	}

   
}
