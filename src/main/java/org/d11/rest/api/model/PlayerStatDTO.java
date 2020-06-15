package org.d11.rest.api.model;

public class PlayerStatDTO extends D11RestApiDTO {

    private Integer goals;
    private Integer goalAssists;
    private Integer ownGoals;
    private Integer goalsConceded;
    private Integer rating;
    private Integer points;

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getGoalAssists() {
        return goalAssists;
    }

    public void setGoalAssists(Integer goalAssists) {
        this.goalAssists = goalAssists;
    }

    public Integer getOwnGoals() {
        return ownGoals;
    }

    public void setOwnGoals(Integer ownGoals) {
        this.ownGoals = ownGoals;
    }

    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

}
