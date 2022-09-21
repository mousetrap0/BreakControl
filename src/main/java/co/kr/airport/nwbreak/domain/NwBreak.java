package co.kr.airport.nwbreak.domain;

import java.util.Date;

public class NwBreak {

	private int rnum;
    private int breakId;
	private String lineId;
    private String facilityGround;
    private String facilityName;
    private Date breakTime;
    private Date recoveryTime;
    private String breakManager;
    private String breakReason;
    private String writer;
    private long failTime;
    
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
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
	public Date getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(Date breakTime) {
		this.breakTime = breakTime;
	}
	public Date getRecoveryTime() {
		return recoveryTime;
	}
	public void setRecoveryTime(Date recoveryTime) {
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
	public long getFailTime() {
		return failTime;
	}
	public void setFailTime(long failTime) {
		this.failTime = failTime;
	}
}
