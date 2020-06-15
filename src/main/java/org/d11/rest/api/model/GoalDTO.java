package org.d11.rest.api.model;

public class GoalDTO extends MatchEventDTO {

    private boolean penalty;
    private boolean ownGoal;

    public boolean isPenalty() {
        return penalty;
    }

    public void setPenalty(boolean penalty) {
        this.penalty = penalty;
    }

    public boolean isOwnGoal() {
        return ownGoal;
    }

    public void setOwnGoal(boolean ownGoal) {
        this.ownGoal = ownGoal;
    }

}
