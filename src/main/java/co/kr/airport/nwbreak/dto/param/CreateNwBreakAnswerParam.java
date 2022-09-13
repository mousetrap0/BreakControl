package co.kr.airport.nwbreak.dto.param;

import co.kr.airport.nwbreak.dto.request.CreateNwBreakRequest;

public class CreateNwBreakAnswerParam {

    private Integer seq;
    private Integer parentSeq;
    private String id;
    private String title;
    private String content;
    private String facilityGround;
    private String facilityName;
    private String breakTime;
    private String recoveryTime;
    private String breakManager;
    private String breakReason;
    private String writer;
    
	public CreateNwBreakAnswerParam(Integer parentSeq, CreateNwBreakRequest req) {
        this.parentSeq = parentSeq;
        this.id = req.getId();
        this.title = req.getTitle();
        this.content = req.getContent();
        this.facilityGround = req.getFacilityGround();
        this.facilityName = req.getFacilityName();
        this.breakTime = req.getBreakTime();
        this.recoveryTime = req.getRecoveryTime();
        this.breakManager = req.getBreakManager();
        this.breakReason = req.getBreakReason();
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
		return facilityGround;
	}

	public void setFacilityGround(String facilityGround) {
		this.facilityGround = facilityGround;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(String breakTime) {
		this.breakTime = breakTime;
	}

	public String getRecoveryTime() {
		return recoveryTime;
	}

	public void setRecoveryTime(String recoveryTime) {
		this.recoveryTime = recoveryTime;
	}

	public String getBreakManager() {
		return breakManager;
	}

	public void setBreakManager(String breakManager) {
		this.breakManager = breakManager;
	}

	public String getBreakReason() {
		return breakReason;
	}

	public void setBreakReason(String breakReason) {
		this.breakReason = breakReason;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

   

}
