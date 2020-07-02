package org.d11.rest.api.model;

import lombok.Data;

@Data
public class MatchDTO extends MatchBaseDTO {

    private TeamBaseDTO homeTeam;
    private TeamBaseDTO awayTeam;
    private MatchDayBaseDTO matchDay;
    private StadiumDTO stadium;

}
