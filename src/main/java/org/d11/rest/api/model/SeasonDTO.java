package org.d11.rest.api.model;

public class SeasonDTO extends SeasonBaseDTO {

    private boolean legacy;
    private int premierLeagueId;
    private String premierLeagueName;
    private int d11LeagueId;
    private String d11LeagueName;

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
