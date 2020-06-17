package org.d11.rest.api.model;

public class D11MatchDayDTO extends D11MatchDayBaseDTO {

    private LeagueBaseDTO d11League;
    private MatchDayBaseDTO matchDay;

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

}
