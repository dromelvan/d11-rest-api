package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PlayerMatchStatDTO extends PlayerMatchStatBaseDTO {

    private MatchDTO match;
    private PlayerBaseDTO player;
    private TeamBaseDTO team;
    private D11TeamBaseDTO d11Team;
    private PositionDTO position;
    
}
