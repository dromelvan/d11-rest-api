package org.d11.rest.api.model;

import lombok.Data;

@Data
public class UserDTO extends D11RestApiDTO {

    private String username;
    private String name;

}
