package org.d11.rest.api.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MatchBaseDTO extends D11RestApiDTO {

    private int whoScoredId;
    private int homeTeamGoals;
    private int awayTeamGoals;
    private int previousHomeTeamGoals;
    private int previousAwayTeamGoals;
    private LocalDateTime datetime;
    private String elapsed;
    private Status status = Status.PENDING;

}
