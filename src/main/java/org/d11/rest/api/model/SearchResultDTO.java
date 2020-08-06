package org.d11.rest.api.model;

import java.util.*;

import lombok.Data;

@Data
public class SearchResultDTO {

    private List<PlayerSearchResultDTO> players = new ArrayList<PlayerSearchResultDTO>();
    
}
