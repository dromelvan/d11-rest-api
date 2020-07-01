package org.d11.rest.api.model;

public class PlayerMatchStatDTO extends PlayerMatchStatBaseDTO {

    private MatchDTO match;
    private PlayerBaseDTO player;
    private TeamBaseDTO team;
    private D11TeamBaseDTO d11Team;
    private PositionDTO position;
    
    public MatchDTO getMatch() {
        return match;
    }
    
    public void setMatch(MatchDTO match) {
        this.match = match;
    }
    
    public PlayerBaseDTO getPlayer() {
        return player;
    }
    
    public void setPlayer(PlayerBaseDTO player) {
        this.player = player;
    }
    
    public TeamBaseDTO getTeam() {
        return team;
    }
    
    public void setTeam(TeamBaseDTO team) {
        this.team = team;
    }
    
    public D11TeamBaseDTO getD11Team() {
        return d11Team;
    }
    
    public void setD11Team(D11TeamBaseDTO d11Team) {
        this.d11Team = d11Team;
    }
    
    public PositionDTO getPosition() {
        return position;
    }
    
    public void setPosition(PositionDTO position) {
        this.position = position;
    }
    
}
