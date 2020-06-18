package org.d11.rest.api.model;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MatchDayDTO extends MatchDayBaseDTO {

    private SeasonBaseDTO season;
    private LeagueBaseDTO premierLeague;
    private D11MatchDayBaseDTO d11MatchDay;
    private Map<LocalDate, List<Long>> matches = new LinkedHashMap<>();

    public SeasonBaseDTO getSeason() {
        return season;
    }

    public void setSeason(SeasonBaseDTO season) {
        this.season = season;
    }

    public LeagueBaseDTO getPremierLeague() {
        return premierLeague;
    }

    public void setPremierLeague(LeagueBaseDTO premierLeague) {
        this.premierLeague = premierLeague;
    }

    public D11MatchDayBaseDTO getD11MatchDay() {
        return d11MatchDay;
    }

    public void setD11MatchDay(D11MatchDayBaseDTO d11MatchDay) {
        this.d11MatchDay = d11MatchDay;
    }

    public Map<LocalDate, List<Long>> getMatches() {
        return matches;
    }

    public void setMatches(Map<LocalDate, List<Long>> matches) {
        this.matches = matches;
    }

}
