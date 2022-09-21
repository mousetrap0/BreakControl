package co.kr.airport.nwbreak.dto.response;

import co.kr.airport.nwbreak.domain.NwBreak;

public class NwBreakResponse {

    private NwBreak nwBreak;

    public NwBreakResponse(NwBreak nwBreak) {
        this.nwBreak = nwBreak;
    }

	public NwBreak getNwBreak() {
		return nwBreak;
	}

	public void setNwBreak(NwBreak nwBreak) {
		this.nwBreak = nwBreak;
	}
}
