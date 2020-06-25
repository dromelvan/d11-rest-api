package org.d11.rest.api.model;

public class TeamTableStatDTO extends TableStatDTO {

    private TeamBaseDTO team;

    public TeamBaseDTO getTeam() {
        return team;
    }

    public void setTeam(TeamBaseDTO team) {
        this.team = team;
    }

}
