package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PlayerSeasonStatDTO extends PlayerSeasonStatBaseDTO {

    private PlayerBaseDTO player;
    private SeasonBaseDTO season;    
    
}
