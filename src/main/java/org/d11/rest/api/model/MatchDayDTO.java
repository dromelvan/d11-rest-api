package org.d11.rest.api.model;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MatchDayDTO extends MatchDayBaseDTO {

    private int seasonId;
    private String seasonName;
    private int premierLeagueId;
    private String premierLeagueName;
    private D11MatchDayBaseDTO d11MatchDay;
    private Map<LocalDate, List<Long>> matches = new LinkedHashMap<>();

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public int getPremierLeagueId() {
        return premierLeagueId;
    }

    public void setPremierLeagueId(int premierLeagueId) {
        this.premierLeagueId = premierLeagueId;
    }

    public String getPremierLeagueName() {
        return premierLeagueName;
    }

    public void setPremierLeagueName(String premierLeagueName) {
        this.premierLeagueName = premierLeagueName;
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
