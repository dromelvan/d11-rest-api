package org.d11.rest.api.model;

import java.time.LocalDate;
import java.util.*;

import lombok.Data;

@Data
public class D11MatchDayDTO extends D11MatchDayBaseDTO {

    private SeasonBaseDTO season;
    private LeagueBaseDTO d11League;
    private MatchDayBaseDTO matchDay;
    private Map<LocalDate, List<Long>> d11Matches = new LinkedHashMap<>();

}
