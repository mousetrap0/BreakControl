package co.kr.airport.nwbreak.dto.response;

import java.util.List;

import co.kr.airport.nwbreak.domain.Chart;

public class ChartResponse {

	private List<Chart> chartList;

	public List<Chart> getChartList() {
		return chartList;
	}

	public void setChartList(List<Chart> chartList) {
		this.chartList = chartList;
	}

	public ChartResponse(List<Chart> chartList) {
		this.chartList = chartList;
	}


}
