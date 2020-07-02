package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PlayerStatDTO extends D11RestApiDTO {

    private Integer goals;
    private Integer goalAssists;
    private Integer ownGoals;
    private Integer goalsConceded;
    private Integer rating;
    private Integer points;

}
