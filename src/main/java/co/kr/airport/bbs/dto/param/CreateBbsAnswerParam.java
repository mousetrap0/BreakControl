package co.kr.airport.bbs.dto.param;

import co.kr.airport.bbs.dto.request.CreateBbsRequest;

public class CreateBbsAnswerParam {

    private Integer seq;
    private Integer parentSeq;
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
    
	public CreateBbsAnswerParam(Integer parentSeq, CreateBbsRequest req) {
        this.parentSeq = parentSeq;
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



	public Integer getParentSeq() {
		return parentSeq;
	}



	public void setParentSeq(Integer parentSeq) {
		this.parentSeq = parentSeq;
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



	public String getFacilityGround() {
		return facilityground;
	}



	public void setFacilityGround(String facilityground) {
		this.facilityground = facilityground;
	}



	public String getFacilityName() {
		return facilityname;
	}



	public void setFacilityName(String facilityname) {
		this.facilityname = facilityname;
	}



	public String getBreakTime() {
		return breaktime;
	}



	public void setBreakTime(String breaktime) {
		this.breaktime = breaktime;
	}



	public String getRecoveryTime() {
		return recoverytime;
	}



	public void setRecoveryTime(String recoverytime) {
		this.recoverytime = recoverytime;
	}



	public String getBreakManager() {
		return breakmanager;
	}



	public void setBreakManager(String breakmanager) {
		this.breakmanager = breakmanager;
	}



	public String getBreakReason() {
		return breakreason;
	}



	public void setBreakReason(String breakreason) {
		this.breakreason = breakreason;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}

}
