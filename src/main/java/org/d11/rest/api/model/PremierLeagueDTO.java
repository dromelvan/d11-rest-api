package org.d11.rest.api.model;

import java.util.ArrayList;
import java.util.List;

public class PremierLeagueDTO extends LeagueDTO {

	private List<Long> matchDays = new ArrayList<Long>();

	public List<Long> getMatchDays() {
		return matchDays;
	}

	public void setMatchDays(List<Long> matchDays) {
		this.matchDays = matchDays;
	}
		
}
