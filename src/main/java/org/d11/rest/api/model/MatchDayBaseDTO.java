package org.d11.rest.api.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MatchDayBaseDTO extends D11RestApiDTO {

    private LocalDate date;
    private int matchDayNumber;
    private Status status = Status.PENDING;

}
