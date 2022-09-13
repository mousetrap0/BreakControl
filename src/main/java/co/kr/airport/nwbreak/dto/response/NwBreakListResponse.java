package co.kr.airport.nwbreak.dto.response;

import java.util.List;
import co.kr.airport.nwbreak.domain.NwBreak;

public class NwBreakListResponse {

    private List<NwBreak> nwBreakList;
    private Integer pageCnt;

    public NwBreakListResponse(List<NwBreak> nwBreakList, Integer pageCnt) {
        this.nwBreakList = nwBreakList;
        this.pageCnt = pageCnt;
    }

	public List<NwBreak> getNwBreakList() {
		return nwBreakList;
	}

	public void setNwBreakList(List<NwBreak> nwBreakList) {
		this.nwBreakList = nwBreakList;
	}

	public Integer getPageCnt() {
		return pageCnt;
	}

	public void setPageCnt(Integer pageCnt) {
		this.pageCnt = pageCnt;
	}

   
}
