package org.d11.rest.api.model;

import java.time.LocalDate;

public class MatchDayBaseDTO extends D11RestApiDTO {

    private LocalDate date;
    private int matchDayNumber;
    private Status status = Status.PENDING;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getMatchDayNumber() {
        return matchDayNumber;
    }

    public void setMatchDayNumber(int matchDayNumber) {
        this.matchDayNumber = matchDayNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
