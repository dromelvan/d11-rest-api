package org.d11.rest.api.model;

public class LeagueDTO extends LeagueBaseDTO {

    private int seasonId;
    private String seasonName;
    private String seasonStatus;

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

    public String getSeasonStatus() {
        return seasonStatus;
    }

    public void setSeasonStatus(String seasonStatus) {
        this.seasonStatus = seasonStatus;
    }

}
