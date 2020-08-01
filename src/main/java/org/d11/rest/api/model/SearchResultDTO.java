package org.d11.rest.api.model;

import java.util.*;

import lombok.Data;

@Data
public class SearchResultDTO {

    private List<PlayerBaseDTO> players = new ArrayList<PlayerBaseDTO>();
    
}
