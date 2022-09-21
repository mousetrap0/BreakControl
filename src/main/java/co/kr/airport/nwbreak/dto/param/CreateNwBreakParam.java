package co.kr.airport.nwbreak.dto.param;

import co.kr.airport.nwbreak.dto.request.CreateNwBreakRequest;

public class CreateNwBreakParam {

	
    private int breakId;
  	private String lineId;
    private String facilityGround;
    private String facilityName;
    private String breakTime;
    private String recoveryTime;
    private String breakManager;
    private String breakReason;
    private String writer;
    private String failTime;

    public CreateNwBreakParam(CreateNwBreakRequest req) {
    	this.breakId = req.getBreakId();
        this.lineId = req.getLineId();
        this.facilityGround = req.getFacilityGround();
        this.facilityName = req.getFacilityName();
        this.breakTime = req.getBreakTime();
        this.recoveryTime = req.getRecoveryTime();
        this.breakManager = req.getBreakManager();
        this.breakReason = req.getBreakReason();
        this.writer = req.getWriter();
        this.failTime = req.getFailTime();
    }

	public int getBreakId() {
		return breakId;
	}

	public void setBreakId(int breakId) {
		this.breakId = breakId;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
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

	public String getFailTime() {
		return failTime;
	}

	public void setFailTime(String failTime) {
		this.failTime = failTime;
	}
	

}
