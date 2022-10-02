package co.kr.airport.nwbreak.dto.param;

public class CreateReadCountParam {

    private Integer breakId; // 게시글 번호
    private String readerId; // 게시글 조회자 아이디

    public CreateReadCountParam(Integer breakId, String readerId) {
        this.breakId = breakId;
        this.readerId = readerId;
    }

    public Integer getBreakId() {
        return breakId;
    }

    public void setBreakId(Integer breakId) {
        this.breakId = breakId;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }
}
