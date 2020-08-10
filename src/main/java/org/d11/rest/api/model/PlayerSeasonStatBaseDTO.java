package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PlayerSeasonStatBaseDTO extends PlayerStatDTO {

    private int cleanSheets;
    private int yellowCards;
    private int redCards;
    private int manOfTheMatch;
    private int sharedManOfTheMatch;
    private int gamesStarted;
    private int gamesSubstitute;
    private int gamesDidNotParticipate;
    private int substitutionsOn;
    private int substitutionsOff;
    private int minutesPlayed;
    private int formPoints;
    private int pointsPerAppearance;
    private int ranking;
    
    public boolean isActive() {
        return getGamesStarted() + getGamesSubstitute() + getGamesDidNotParticipate() > 0;
    }
    
}
