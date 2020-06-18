package org.d11.rest.api.model;

import java.util.ArrayList;
import java.util.List;

public class PremierLeagueDTO extends LeagueBaseDTO {

    private SeasonBaseDTO season;
    private List<Long> matchDays = new ArrayList<Long>();

    public SeasonBaseDTO getSeason() {
        return season;
    }

    public void setSeason(SeasonBaseDTO season) {
        this.season = season;
    }

    public List<Long> getMatchDays() {
        return matchDays;
    }

    public void setMatchDays(List<Long> matchDays) {
        this.matchDays = matchDays;
    }

}
