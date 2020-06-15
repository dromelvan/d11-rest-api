package org.d11.rest.api.model;

import java.time.LocalDate;

public class SeasonDTO extends D11RestApiDTO {

    private String name;
    private Status status = Status.PENDING;
    private LocalDate date;
    private boolean legacy;
    private int premierLeagueId;
    private String premierLeagueName;
    private int d11LeagueId;
    private String d11LeagueName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isLegacy() {
        return legacy;
    }

    public void setLegacy(boolean legacy) {
        this.legacy = legacy;
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

    public int getD11LeagueId() {
        return d11LeagueId;
    }

    public void setD11LeagueId(int d11LeagueId) {
        this.d11LeagueId = d11LeagueId;
    }

    public String getD11LeagueName() {
        return d11LeagueName;
    }

    public void setD11LeagueName(String d11LeagueName) {
        this.d11LeagueName = d11LeagueName;
    }

}
