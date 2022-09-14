package co.kr.airport.nwbreak.dto.response;

public class CreateNwBreakResponse {

	private int breakId;

    public CreateNwBreakResponse(int breakId) {
        this.breakId = breakId;
    }

	public int getBreakId() {
		return breakId;
	}

	public void setBreakId(int breakId) {
		this.breakId = breakId;
	}

}
