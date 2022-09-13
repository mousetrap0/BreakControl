package co.kr.airport.nwbreak.dto.response;

public class CreateNwBreakResponse {

    private Integer seq;

    public CreateNwBreakResponse(Integer seq) {
        this.seq = seq;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}
