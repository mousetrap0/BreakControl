package co.kr.airport.nwbreak.domain;

import java.util.Date;


public class NwBreak {

	private int rnum;
	private int breakId;
	private String lineId;
	private Date breakTime;
	private Date notifyTime;
	private String notifyToKtYn;
	private Date recoveryTime;
	private String breakPoint;
	private String actualReportYn;
	private String remark;
	private String createUser;
	private Date createTime;
	private String updateUser;
	private Date updateTime;
	
	
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
	public Date getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(Date breakTime) {
		this.breakTime = breakTime;
	}
	public Date getNotifyTime() {
		return notifyTime;
	}
	public void setNotifyTime(Date notifyTime) {
		this.notifyTime = notifyTime;
	}
	public String getNotifyToKtYn() {
		return notifyToKtYn;
	}
	public void setNotifyToKtYn(String notifyToKtYn) {
		this.notifyToKtYn = notifyToKtYn;
	}
	public Date getRecoveryTime() {
		return recoveryTime;
	}
	public void setRecoveryTime(Date recoveryTime) {
		this.recoveryTime = recoveryTime;
	}
	public String getBreakPoint() {
		return breakPoint;
	}
	public void setBreakPoint(String breakPoint) {
		this.breakPoint = breakPoint;
	}
	public String getActualReportYn() {
		return actualReportYn;
	}
	public void setActualReportYn(String actualReportYn) {
		this.actualReportYn = actualReportYn;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
	
}
