package org.d11.rest.api.model;

import lombok.Data;

@Data
public class PlayerSeasonInfoBaseDTO extends D11RestApiDTO {

    private int value;
    
    public String getValueString() {
        double doubleValue = (double)getValue();
        return String.valueOf(doubleValue / 10);
    }
    
}
