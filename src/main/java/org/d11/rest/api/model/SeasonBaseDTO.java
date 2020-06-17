package org.d11.rest.api.model;

import java.time.LocalDate;

public class SeasonBaseDTO extends D11RestApiDTO {

    private String name;
    private Status status = Status.PENDING;
    private LocalDate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
