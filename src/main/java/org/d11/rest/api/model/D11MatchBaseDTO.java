package org.d11.rest.api.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class D11MatchBaseDTO extends D11RestApiDTO {

    private Integer homeTeamGoals;
    private Integer awayTeamGoals;
    private Integer homeTeamPoints;
    private Integer awayTeamPoints;
    private Integer previousHomeTeamGoals;
    private Integer previousAwayTeamGoals;
    private Integer previousHomeTeamPoints;
    private Integer previousAwayTeamPoints;
    private LocalDate date;
    private String elapsed;
    private Status status = Status.PENDING;

}
