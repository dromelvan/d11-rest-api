package org.d11.rest.api.model;

import lombok.Data;

@Data
public class TeamDTO extends TeamBaseDTO {

    private int stadiumId;
    private String stadiumName;
    private int whoScoredId;
    private String nickname;
    private int established;
    private String motto;
    private String colour;
    private boolean dummy;

}
