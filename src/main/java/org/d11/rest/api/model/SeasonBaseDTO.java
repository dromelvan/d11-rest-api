package org.d11.rest.api.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SeasonBaseDTO extends D11RestApiDTO {

    private String name;
    private String shortName;
    private Status status = Status.PENDING;
    private LocalDate date;

}
