package org.d11.rest.api.model;

public class PlayerMatchStatDetailsDTO extends PlayerMatchStatDTO {

	private PlayerNameDTO playerNameDTO;
	private TeamNameDTO teamNameDTO;
	private D11TeamNameDTO d11TeamNameDTO;
	private PositionDTO positionDTO;

	public PlayerNameDTO getPlayer() {
		return playerNameDTO;
	}

	public void setPlayer(PlayerNameDTO playerNameDTO) {
		this.playerNameDTO = playerNameDTO;
	}

	public TeamNameDTO getTeam() {
		return teamNameDTO;
	}

	public void setTeam(TeamNameDTO teamNameDTO) {
		this.teamNameDTO = teamNameDTO;
	}

	public D11TeamNameDTO getD11Team() {
		return d11TeamNameDTO;
	}

	public void setD11Team(D11TeamNameDTO d11TeamNameDTO) {
		this.d11TeamNameDTO = d11TeamNameDTO;
	}

	public PositionDTO getPosition() {
		return positionDTO;
	}

	public void setPosition(PositionDTO positionDTO) {
		this.positionDTO = positionDTO;
	}	
		
}
