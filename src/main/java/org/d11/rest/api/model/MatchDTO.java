package org.d11.rest.api.model;

import java.time.LocalDateTime;

import org.d11.rest.api.Endpoint;

public class MatchDTO extends D11RestApiDTO {

	private int homeTeamId;
	private String homeTeamName;
	private String homeTeamShortName;
	private int awayTeamId;
	private String awayTeamName;
	private String awayTeamShortName;
	private int matchDayId;
	private int matchDayMatchDayNumber;
	private int matchDayPremierLeagueId;
	private int stadiumId;
	private String stadiumName;
	private String stadiumCity;
	private int whoScoredId;
	private int homeTeamGoals;
	private int awayTeamGoals;
	private int previousHomeTeamGoals;
	private int previousAwayTeamGoals;
	private LocalDateTime datetime;
	private String elapsed;
	private Status status = Status.PENDING;
	
	public int getHomeTeamId() {
		return homeTeamId;
	}
	
	public void setHomeTeamId(int homeTeamId) {
		this.homeTeamId = homeTeamId;
	}
	
	public String getHomeTeamName() {
		return homeTeamName;
	}
	
	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}	
	
	public String getHomeTeamShortName() {
		return homeTeamShortName;
	}

	public void setHomeTeamShortName(String homeTeamShortName) {
		this.homeTeamShortName = homeTeamShortName;
	}

	public int getAwayTeamId() {
		return awayTeamId;
	}
	
	public void setAwayTeamId(int awayTeamId) {
		this.awayTeamId = awayTeamId;
	}
	
	public String getAwayTeamName() {
		return awayTeamName;
	}
	
	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}

	public String getAwayTeamShortName() {
		return awayTeamShortName;
	}

	public void setAwayTeamShortName(String awayTeamShortName) {
		this.awayTeamShortName = awayTeamShortName;
	}
	
	public int getMatchDayId() {
		return matchDayId;
	}
	
	public void setMatchDayId(int matchDayId) {
		this.matchDayId = matchDayId;
	}
	
	public int getMatchDayMatchDayNumber() {
		return matchDayMatchDayNumber;
	}
	
	public void setMatchDayMatchDayNumber(int matchDayMatchDayNumber) {
		this.matchDayMatchDayNumber = matchDayMatchDayNumber;
	}
		
	public int getMatchDayPremierLeagueId() {
		return matchDayPremierLeagueId;
	}

	public void setMatchDayPremierLeagueId(int matchDayPremierLeagueId) {
		this.matchDayPremierLeagueId = matchDayPremierLeagueId;
	}

	public int getStadiumId() {
		return stadiumId;
	}
	
	public void setStadiumId(int stadiumId) {
		this.stadiumId = stadiumId;
	}
	
	public String getStadiumName() {
		return stadiumName;
	}
	
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
		
	public String getStadiumCity() {
		return stadiumCity;
	}

	public void setStadiumCity(String stadiumCity) {
		this.stadiumCity = stadiumCity;
	}

	public int getWhoScoredId() {
		return whoScoredId;
	}
	
	public void setWhoScoredId(int whoScoredId) {
		this.whoScoredId = whoScoredId;
	}
	
	public int getHomeTeamGoals() {
		return homeTeamGoals;
	}
	
	public void setHomeTeamGoals(int homeTeamGoals) {
		this.homeTeamGoals = homeTeamGoals;
	}
	
	public int getAwayTeamGoals() {
		return awayTeamGoals;
	}
	
	public void setAwayTeamGoals(int awayTeamGoals) {
		this.awayTeamGoals = awayTeamGoals;
	}
	
	public int getPreviousHomeTeamGoals() {
		return previousHomeTeamGoals;
	}
	
	public void setPreviousHomeTeamGoals(int previousHomeTeamGoals) {
		this.previousHomeTeamGoals = previousHomeTeamGoals;
	}
	
	public int getPreviousAwayTeamGoals() {
		return previousAwayTeamGoals;
	}
	
	public void setPreviousAwayTeamGoals(int previousAwayTeamGoals) {
		this.previousAwayTeamGoals = previousAwayTeamGoals;
	}
	
	public LocalDateTime getDatetime() {
		return datetime;
	}
	
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	
	public String getElapsed() {
		return elapsed;
	}
	
	public void setElapsed(String elapsed) {
		this.elapsed = elapsed;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String getUrl() {
		return Endpoint.MATCH.replace("{id}", String.valueOf(getId()));
	}
	
	public String getEventsUrl() {
		return Endpoint.MATCH_EVENTS.replace("{id}", String.valueOf(getId()));
	}

	public String getStatsUrl() {
		return Endpoint.MATCH_STATS.replace("{id}", String.valueOf(getId()));
	}
	
}
