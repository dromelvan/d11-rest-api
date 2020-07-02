package org.d11.rest.api.model;

import lombok.Data;

@Data
public class D11TeamDTO extends D11TeamBaseDTO {

    private int ownerId;
    private String ownerName;

}
