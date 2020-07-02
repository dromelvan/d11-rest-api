package org.d11.rest.api.model;

import lombok.Data;

@Data
public class CountryDTO extends D11RestApiDTO {

    private String name;
    private String iso;

}
