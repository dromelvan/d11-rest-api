package org.d11.rest.api.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchMatchStatsDTO extends MatchMatchEventsDTO {

	private Map<Long, Map<String, List<PlayerMatchStatDetailsDTO>>> playerMatchStats = new HashMap<>();
	
	public Map<Long, Map<String, List<PlayerMatchStatDetailsDTO>>> getPlayerMatchStats() {
		return playerMatchStats;
	}

	public void setPlayerMatchStats(Map<Long, Map<String, List<PlayerMatchStatDetailsDTO>>> playerMatchStats) {
		this.playerMatchStats = playerMatchStats;
	}
	
}
