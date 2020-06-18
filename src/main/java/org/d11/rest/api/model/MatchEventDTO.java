package org.d11.rest.api.model;

public class MatchEventDTO extends MatchEventBaseDTO {

    private MatchBaseDTO match;
    private TeamBaseDTO team;
    private PlayerBaseDTO player;

    public MatchBaseDTO getMatch() {
        return match;
    }

    public void setMatch(MatchBaseDTO match) {
        this.match = match;
    }

    public TeamBaseDTO getTeam() {
        return team;
    }

    public void setTeam(TeamBaseDTO team) {
        this.team = team;
    }

    public PlayerBaseDTO getPlayer() {
        return player;
    }

    public void setPlayer(PlayerBaseDTO player) {
        this.player = player;
    }

}
