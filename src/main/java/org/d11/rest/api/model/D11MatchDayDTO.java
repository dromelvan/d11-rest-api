package org.d11.rest.api.model;

import java.util.*;

public class D11MatchDayDTO extends D11MatchDayBaseDTO {

    private SeasonBaseDTO season;
    private LeagueBaseDTO d11League;
    private MatchDayBaseDTO matchDay;
    private List<Long> d11Matches = new ArrayList<>();

    public SeasonBaseDTO getSeason() {
        return season;
    }

    public void setSeason(SeasonBaseDTO season) {
        this.season = season;
    }

    public LeagueBaseDTO getD11League() {
        return d11League;
    }

    public void setD11League(LeagueBaseDTO d11League) {
        this.d11League = d11League;
    }

    public MatchDayBaseDTO getMatchDay() {
        return matchDay;
    }

    public void setMatchDay(MatchDayBaseDTO matchDay) {
        this.matchDay = matchDay;
    }

    public List<Long> getD11Matches() {
        return d11Matches;
    }

    public void setD11Matches(List<Long> d11Matches) {
        this.d11Matches = d11Matches;
    }

}
