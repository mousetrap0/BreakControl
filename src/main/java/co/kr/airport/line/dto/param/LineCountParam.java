package co.kr.airport.line.dto.param;

import co.kr.airport.line.dto.request.LineListRequest;

public class LineCountParam {

    private String choice;
    private String search;

    public LineCountParam(LineListRequest req) {
        this.choice = req.getChoice();
        this.search = req.getChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
