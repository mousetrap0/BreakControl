package co.kr.airport.nwbreak.dto.param;

import co.kr.airport.nwbreak.dto.request.UpdateNwBreakRequest;

public class UpdateNwBreakParam {

    private Integer breakId;

    private String title;

    private String content;


    public UpdateNwBreakParam(Integer breakId, UpdateNwBreakRequest req) {
        this.breakId = breakId;
        this.title = req.getTitle();
        this.content = req.getContent();
    }

    public Integer getBreakId() {
        return breakId;
    }

    public void setBreakId(Integer breakId) {
        this.breakId = breakId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
