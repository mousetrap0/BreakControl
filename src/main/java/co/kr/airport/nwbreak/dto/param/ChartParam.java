package co.kr.airport.nwbreak.dto.param;


public class ChartParam {
    private String start;
    private String end;
    
	public ChartParam(String start, String end) {
		this.start = start;
		this.end = end;
	}
	
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
    
    
   

}
