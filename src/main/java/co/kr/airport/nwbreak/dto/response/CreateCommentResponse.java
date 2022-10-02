package co.kr.airport.nwbreak.dto.response;

public class CreateCommentResponse {

    private Integer breakId;

    public CreateCommentResponse(Integer breakId) {
        this.breakId = breakId;
    }

    public Integer getBreakId() {
        return breakId;
    }

    public void setBreakId(Integer breakId) {
        this.breakId = breakId;
    }
}
