package org.d11.rest.api.model;

import java.time.LocalDateTime;

public class MatchBaseDTO extends D11RestApiDTO {

    private int whoScoredId;
    private int homeTeamGoals;
    private int awayTeamGoals;
    private int previousHomeTeamGoals;
    private int previousAwayTeamGoals;
    private LocalDateTime datetime;
    private String elapsed;
    private Status status = Status.PENDING;

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

}
