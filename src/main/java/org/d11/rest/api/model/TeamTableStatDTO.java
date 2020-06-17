package org.d11.rest.api.model;

public class TeamTableStatDTO extends TableStatDTO {

    private TeamBaseDTO teamNameDTO;

    public TeamBaseDTO getTeam() {
        return teamNameDTO;
    }

    public void setTeam(TeamBaseDTO teamNameDTO) {
        this.teamNameDTO = teamNameDTO;
    }

}
