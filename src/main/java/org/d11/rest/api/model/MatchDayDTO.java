package org.d11.rest.api.model;

import java.time.LocalDate;
import java.util.*;

import lombok.Data;

@Data
public class MatchDayDTO extends MatchDayBaseDTO {

    private SeasonBaseDTO season;
    private LeagueBaseDTO premierLeague;
    private D11MatchDayBaseDTO d11MatchDay;
    private Map<LocalDate, List<Long>> matches = new LinkedHashMap<>();

}
