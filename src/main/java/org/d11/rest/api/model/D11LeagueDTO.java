package org.d11.rest.api.model;

public class D11LeagueDTO extends LeagueBaseDTO {

    private SeasonBaseDTO season;

    public SeasonBaseDTO getSeason() {
        return season;
    }

    public void setSeason(SeasonBaseDTO season) {
        this.season = season;
    }

}
