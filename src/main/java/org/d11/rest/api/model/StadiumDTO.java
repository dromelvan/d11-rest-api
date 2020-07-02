package org.d11.rest.api.model;

import lombok.Data;

@Data
public class StadiumDTO extends D11RestApiDTO {

    private String name;
    private String city;
    private int capacity;
    private int opened;

}
