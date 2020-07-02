package org.d11.rest.api.model;

import java.util.*;

import lombok.Data;

@Data
public class D11LeagueDTO extends LeagueBaseDTO {

    private SeasonBaseDTO season;
    private List<Long> d11MatchDays = new ArrayList<Long>();

}
