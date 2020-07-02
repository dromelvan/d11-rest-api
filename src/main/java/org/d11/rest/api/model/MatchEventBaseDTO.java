package org.d11.rest.api.model;

import lombok.Data;

@Data
public class MatchEventBaseDTO extends D11RestApiDTO {

    private int time;
    private int addedTime;

}
