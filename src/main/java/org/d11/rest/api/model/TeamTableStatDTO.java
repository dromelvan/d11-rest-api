package org.d11.rest.api.model;

public class TeamTableStatDTO extends TableStatDTO {

    private TeamNameDTO teamNameDTO;

    public TeamNameDTO getTeam() {
        return teamNameDTO;
    }

    public void setTeam(TeamNameDTO teamNameDTO) {
        this.teamNameDTO = teamNameDTO;
    }

}
