package org.d11.rest.api.model;

import lombok.Data;

@Data
public class D11TeamBaseDTO extends D11RestApiDTO {

    private String name;
    private String shortName;
    private String code;
    private boolean dummy;

}
