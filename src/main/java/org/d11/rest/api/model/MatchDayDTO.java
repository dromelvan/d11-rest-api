package org.d11.rest.api.model;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MatchDayDTO extends D11RestApiDTO {

    private int seasonId;
    private String seasonName;
    private int premierLeagueId;
    private String premierLeagueName;
    private LocalDate date;
    private int matchDayNumber;
    private Status status = Status.PENDING;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getMatchDayNumber() {
        return matchDayNumber;
    }

    public void setMatchDayNumber(int matchDayNumber) {
        this.matchDayNumber = matchDayNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Map<LocalDate, List<Long>> getMatches() {
        return matches;
    }

    public void setMatches(Map<LocalDate, List<Long>> matches) {
        this.matches = matches;
    }

}
