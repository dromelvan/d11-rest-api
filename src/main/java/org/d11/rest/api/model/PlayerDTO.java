package org.d11.rest.api.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PlayerDTO extends PlayerBaseDTO {

    private CountryDTO country;
    private int whoScoredId;
    private LocalDate dateOfBirth;
    private int height;
    private int weight;
    private String parameterizedName;

}
