package co.kr.airport.nwbreak.dto.param;

import co.kr.airport.nwbreak.dto.request.NwBreakListRequest;

public class NwBreakCountParam {

    private String choice;
    private String search;

    public NwBreakCountParam(NwBreakListRequest req) {
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
