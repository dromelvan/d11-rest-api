package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PlayerSeasonInfoDTO extends PlayerSeasonInfoBaseDTO {

    private PlayerBaseDTO player;
    private SeasonBaseDTO season;    
    private TeamBaseDTO team;
    private D11TeamBaseDTO d11Team;
    private PositionDTO position;
    
}
