package org.d11.rest.api.model;

import java.util.*;

import lombok.Data;

@Data
public class PremierLeagueDTO extends LeagueBaseDTO {

    private SeasonBaseDTO season;
    private List<Long> matchDays = new ArrayList<Long>();

}
