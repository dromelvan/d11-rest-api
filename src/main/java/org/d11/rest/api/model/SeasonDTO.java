package org.d11.rest.api.model;

public class SeasonDTO extends SeasonBaseDTO {

    private LeagueBaseDTO premierLeague;
    private LeagueBaseDTO d11League;
    private boolean legacy;

    public LeagueBaseDTO getPremierLeague() {
        return premierLeague;
    }

    public void setPremierLeague(LeagueBaseDTO premierLeague) {
        this.premierLeague = premierLeague;
    }

    public LeagueBaseDTO getD11League() {
        return d11League;
    }

    public void setD11League(LeagueBaseDTO d11League) {
        this.d11League = d11League;
    }

    public boolean isLegacy() {
        return legacy;
    }

    public void setLegacy(boolean legacy) {
        this.legacy = legacy;
    }

}
