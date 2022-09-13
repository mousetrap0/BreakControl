package co.kr.airport.nwbreak.dto.request;

public class CreateNwBreakRequest {

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
