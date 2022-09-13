package co.kr.airport.bbs.dto.param;

import co.kr.airport.bbs.dto.request.CreateBbsRequest;

public class CreateBbsParam {

    private Integer seq;
    private String id;
    private String title;
    private String content;
    private String facilityground;
    private String facilityname;
    private String breaktime;
    private String recoverytime;
    private String breakmanager;
    private String breakreason;
    private String writer;

    public CreateBbsParam(CreateBbsRequest req) {
        this.id = req.getId();
        this.title = req.getTitle();
        this.content = req.getContent();
        this.facilityground = req.getFacilityGround();
        this.facilityname = req.getFacilityName();
        this.breaktime = req.getBreakTime();
        this.recoverytime = req.getRecoveryTime();
        this.breakmanager = req.getBreakManager();
        this.breakreason = req.getBreakReason();
        this.writer = req.getWriter();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public String getFacilityground() {
        return facilityground;
    }

    public void setFacilityground(String facilityground) {
        this.facilityground = facilityground;
    }
    public String getFacilityname() {
        return facilityname;
    }

    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname;
    }
    public String getBreaktime() {
        return breaktime;
    }

    public void setBreaktime(String breaktime) {
        this.breaktime = breaktime;
    }
    public String getRecoverytime() {
        return recoverytime;
    }
    
    public void setRecoverytime(String recoverytime) {
        this.recoverytime = recoverytime;
    }
    public String getBreakmanager() {
        return breakmanager;
    }
    
    public void setBreakmanager(String breakmanager) {
        this.breakmanager = breakmanager;
    }
    public String getBreakreason() {
        return breakreason;
    }
    
    public void setBreakreason(String breakreason) {
        this.breakreason = breakreason;
    }
    public String getWriter() {
        return writer;
    }
    
    public void setWriter(String writer) {
        this.writer = writer;
    }
}
