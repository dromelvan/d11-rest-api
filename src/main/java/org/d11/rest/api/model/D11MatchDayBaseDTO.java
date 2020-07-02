package org.d11.rest.api.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class D11MatchDayBaseDTO extends D11RestApiDTO {

    private LocalDate date;
    private int matchDayNumber;

}
