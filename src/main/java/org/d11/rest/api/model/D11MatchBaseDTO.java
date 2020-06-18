package org.d11.rest.api.model;

public class D11MatchBaseDTO extends D11RestApiDTO {

    private Integer homeTeamGoals;
    private Integer awayTeamGoals;
    private Integer homeTeamPoints;
    private Integer awayTeamPoints;
    private Integer previousHomeTeamGoals;
    private Integer previousAwayTeamGoals;
    private Integer previousHomeTeamPoints;
    private Integer previousAwayTeamPoints;
    private String elapsed;
    private Status status = Status.PENDING;

    public Integer getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(Integer homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public Integer getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public void setAwayTeamGoals(Integer awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }

    public Integer getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public void setHomeTeamPoints(Integer homeTeamPoints) {
        this.homeTeamPoints = homeTeamPoints;
    }

    public Integer getAwayTeamPoints() {
        return awayTeamPoints;
    }

    public void setAwayTeamPoints(Integer awayTeamPoints) {
        this.awayTeamPoints = awayTeamPoints;
    }

    public Integer getPreviousHomeTeamGoals() {
        return previousHomeTeamGoals;
    }

    public void setPreviousHomeTeamGoals(Integer previousHomeTeamGoals) {
        this.previousHomeTeamGoals = previousHomeTeamGoals;
    }

    public Integer getPreviousAwayTeamGoals() {
        return previousAwayTeamGoals;
    }

    public void setPreviousAwayTeamGoals(Integer previousAwayTeamGoals) {
        this.previousAwayTeamGoals = previousAwayTeamGoals;
    }

    public Integer getPreviousHomeTeamPoints() {
        return previousHomeTeamPoints;
    }

    public void setPreviousHomeTeamPoints(Integer previousHomeTeamPoints) {
        this.previousHomeTeamPoints = previousHomeTeamPoints;
    }

    public Integer getPreviousAwayTeamPoints() {
        return previousAwayTeamPoints;
    }

    public void setPreviousAwayTeamPoints(Integer previousAwayTeamPoints) {
        this.previousAwayTeamPoints = previousAwayTeamPoints;
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
