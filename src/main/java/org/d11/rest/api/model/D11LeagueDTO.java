package org.d11.rest.api.model;

import java.util.*;

public class D11LeagueDTO extends LeagueBaseDTO {

    private SeasonBaseDTO season;
    private List<Long> d11MatchDays = new ArrayList<Long>();

    public SeasonBaseDTO getSeason() {
        return season;
    }

    public void setSeason(SeasonBaseDTO season) {
        this.season = season;
    }

    public List<Long> getD11MatchDays() {
        return d11MatchDays;
    }

    public void setD11MatchDays(List<Long> d11MatchDays) {
        this.d11MatchDays = d11MatchDays;
    }

}
