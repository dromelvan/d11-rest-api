package org.d11.rest.api.model;

public class MatchMatchStatsDTO extends MatchMatchEventsDTO {

    private PlayerMatchStatsByTeamIdPositionDTO playerMatchStats;

    public PlayerMatchStatsByTeamIdPositionDTO getPlayerMatchStats() {
        return playerMatchStats;
    }

    public void setPlayerMatchStats(PlayerMatchStatsByTeamIdPositionDTO playerMatchStats) {
        this.playerMatchStats = playerMatchStats;
    }

}
