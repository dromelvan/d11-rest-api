package org.d11.rest.api.model;

public class MatchEventDTO extends D11RestApiDTO {

    private int matchId;
    private int teamId;
    private String teamName;
    private int playerId;
    private String playerName;
    private String playerLastName;
    private String playerShortName;    
    private int time;
    private int addedTime;
    
	public int getMatchId() {
		return matchId;
	}
	
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	
	public int getTeamId() {
		return teamId;
	}
	
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
			
	public String getPlayerLastName() {
		return playerLastName;
	}

	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}

	public String getPlayerShortName() {
		return playerShortName;
	}

	public void setPlayerShortName(String playerShortName) {
		this.playerShortName = playerShortName;
	}

	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public int getAddedTime() {
		return addedTime;
	}
	
	public void setAddedTime(int addedTime) {
		this.addedTime = addedTime;
	}	
	    
}
