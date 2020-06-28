package org.d11.rest.api.model;

public class PlayerMatchStatDTO extends PlayerMatchStatBaseDTO {

    private PlayerBaseDTO playerNameDTO;
    private TeamBaseDTO teamNameDTO;
    private D11TeamBaseDTO d11TeamNameDTO;
    private PositionDTO positionDTO;

    public PlayerBaseDTO getPlayer() {
        return playerNameDTO;
    }

    public void setPlayer(PlayerBaseDTO playerNameDTO) {
        this.playerNameDTO = playerNameDTO;
    }

    public TeamBaseDTO getTeam() {
        return teamNameDTO;
    }

    public void setTeam(TeamBaseDTO teamNameDTO) {
        this.teamNameDTO = teamNameDTO;
    }

    public D11TeamBaseDTO getD11Team() {
        return d11TeamNameDTO;
    }

    public void setD11Team(D11TeamBaseDTO d11TeamNameDTO) {
        this.d11TeamNameDTO = d11TeamNameDTO;
    }

    public PositionDTO getPosition() {
        return positionDTO;
    }

    public void setPosition(PositionDTO positionDTO) {
        this.positionDTO = positionDTO;
    }

}
