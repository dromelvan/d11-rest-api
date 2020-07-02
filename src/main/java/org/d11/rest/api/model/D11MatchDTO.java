package org.d11.rest.api.model;

import java.util.*;

import lombok.Data;

@Data
public class D11MatchDTO extends D11MatchBaseDTO {

    private D11TeamBaseDTO homeD11Team;
    private D11TeamBaseDTO awayD11Team;
    private D11MatchDayBaseDTO d11MatchDay;
    private Map<Long, Long> remainingPlayerCount = new HashMap<>();

}
