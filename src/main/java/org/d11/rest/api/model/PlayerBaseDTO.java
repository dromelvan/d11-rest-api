package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PlayerBaseDTO extends D11RestApiDTO {

    private String firstName;
    private String lastName;

    public String getName() {
        return (getFirstName() + " " + getLastName()).trim();
    }

    public String getShortName() {
        if (getFirstName().isEmpty()) {
            return getLastName();
        } else {
            return getLastName() + " " + getFirstName().charAt(0);
        }
    }

}
