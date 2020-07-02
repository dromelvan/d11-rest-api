package org.d11.rest.api.model;

import lombok.Data;

@Data
public class MatchEventDTO extends MatchEventBaseDTO {

    private MatchBaseDTO match;
    private TeamBaseDTO team;
    private PlayerBaseDTO player;

}
