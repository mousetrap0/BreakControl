package co.kr.airport.line.domain;

public class Line {

	private String lineId;
	private String lineName;
	
	private String channelMode;
	private String speed;
	private String npcNumber;
	
	private String msppNumber;

	
	public Line() {
	}

	

	public Line(String lineId, String lineName, String channelMode, String speed, String npcNumber, String msppNumber) {
		super();
		this.lineId = lineId;
		this.lineName = lineName;
		this.channelMode = channelMode;
		this.speed = speed;
		this.npcNumber = npcNumber;
		this.msppNumber = msppNumber;
	}



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



	public String getChannelMode() {
		return channelMode;
	}



	public void setChannelMode(String channelMode) {
		this.channelMode = channelMode;
	}



	public String getSpeed() {
		return speed;
	}



	public void setSpeed(String speed) {
		this.speed = speed;
	}



	public String getNpcNumber() {
		return npcNumber;
	}



	public void setNpcNumber(String npcNumber) {
		this.npcNumber = npcNumber;
	}



	public String getMsppNumber() {
		return msppNumber;
	}



	public void setMsppNumber(String msppNumber) {
		this.msppNumber = msppNumber;
	}



	@Override
	public String toString() {
		return "Line [lineId=" + lineId + ", lineName=" + lineName + ", channelMode=" + channelMode + ", speed=" + speed
				+ ", npcNumber=" + npcNumber + ", msppNumber=" + msppNumber + "]";
	}
}
