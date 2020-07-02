package org.d11.rest.api.model;

import lombok.Data;

@Data
public class SeasonDTO extends SeasonBaseDTO {

    private LeagueBaseDTO premierLeague;
    private LeagueBaseDTO d11League;
    private boolean legacy;

}
