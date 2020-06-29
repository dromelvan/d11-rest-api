package org.d11.rest.api.model;

import org.d11.rest.api.collection.MatchPlayerMatchStatsDTO;

public class MatchMatchStatsDTO extends MatchMatchEventsDTO {

    private MatchPlayerMatchStatsDTO playerMatchStats;

    public MatchPlayerMatchStatsDTO getPlayerMatchStats() {
        return playerMatchStats;
    }

    public void setPlayerMatchStats(MatchPlayerMatchStatsDTO playerMatchStats) {
        this.playerMatchStats = playerMatchStats;
    }

}
