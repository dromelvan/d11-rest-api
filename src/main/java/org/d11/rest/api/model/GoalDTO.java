package org.d11.rest.api.model;

import lombok.Data;

@Data
public class GoalDTO extends MatchEventDTO {

    private boolean penalty;
    private boolean ownGoal;

}
