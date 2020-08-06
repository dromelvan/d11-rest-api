package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PlayerSearchResultDTO extends D11RestApiDTO {

    public String name;    
    public Long teamId;    
    public String teamName;
    
}
