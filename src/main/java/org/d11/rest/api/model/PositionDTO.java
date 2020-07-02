package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PositionDTO extends D11RestApiDTO {

    private String name;
    private String code;
    private boolean defender;
    private int sortOrder;
    
}
