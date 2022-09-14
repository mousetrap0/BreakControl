package co.kr.airport.line.dto.response;

import co.kr.airport.line.domain.Line;

public class LineResponse {

    private Line line;

    public LineResponse(Line line) {
        this.line = line;
    }

	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

  
}
