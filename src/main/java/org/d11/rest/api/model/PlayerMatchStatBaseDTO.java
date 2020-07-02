package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PlayerMatchStatBaseDTO extends PlayerStatDTO {

    private String playedPosition;
    private int lineup;
    private int substitutionOnTime;
    private int substitutionOffTime;
    private int yellowCardTime;
    private int redCardTime;
    private boolean manOfTheMatch;
    private boolean sharedManOfTheMatch;

}
