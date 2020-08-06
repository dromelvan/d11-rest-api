package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PlayerSeasonInfoDTO extends D11RestApiDTO {

    private PlayerBaseDTO player;
    private SeasonBaseDTO season;    
    private TeamBaseDTO team;
    private D11TeamBaseDTO d11Team;
    private PositionDTO position;
    private int value;
    
    public String getValueString() {
        double doubleValue = (double)getValue();
        return String.valueOf(doubleValue / 10);
    }
    
}
