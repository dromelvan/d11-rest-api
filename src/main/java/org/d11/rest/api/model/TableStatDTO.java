package org.d11.rest.api.model;

import lombok.Data;

@Data
public class TableStatDTO extends D11RestApiDTO {

    private Integer matchesPlayed;
    private Integer matchesWon;
    private Integer matchesDrawn;
    private Integer matchesLost;
    private Integer goalsFor;
    private Integer goalsAgainst;
    private Integer goalDifference;
    private Integer points;
    private Integer ranking;

    private Integer homeMatchesPlayed;
    private Integer homeMatchesWon;
    private Integer homeMatchesDrawn;
    private Integer homeMatchesLost;
    private Integer homeGoalsFor;
    private Integer homeGoalsAgainst;
    private Integer homeGoalDifference;
    private Integer homePoints;
    private Integer homeRanking;

    private Integer awayMatchesPlayed;
    private Integer awayMatchesWon;
    private Integer awayMatchesDrawn;
    private Integer awayMatchesLost;
    private Integer awayGoalsFor;
    private Integer awayGoalsAgainst;
    private Integer awayGoalDifference;
    private Integer awayPoints;
    private Integer awayRanking;

    private Integer formPoints;
    private Integer previousRanking;

}
