package co.kr.airport.nwbreak.domain;

public class Chart {

	private String lineId;
	private String lineName;
	private int failCount;
	private long failTimeTotal;
	private long breakCount;

	
	public String getLineId() {
		return lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public int getFailCount() {
		return failCount;
	}
	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}
	public long getFailTimeTotal() {
		return failTimeTotal;
	}
	public void setFailTimeTotal(long failTimeTotal) {
		this.failTimeTotal = failTimeTotal;
	}
	public long getBreakCount() {
		return breakCount;
	}
	public void setBreakCount(long breakCount) {
		this.breakCount = breakCount;
	}

}
