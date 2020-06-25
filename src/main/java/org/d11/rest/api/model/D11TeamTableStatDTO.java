package org.d11.rest.api.model;

public class D11TeamTableStatDTO extends TableStatDTO {

    private D11TeamBaseDTO d11Team;

    public D11TeamBaseDTO getD11Team() {
        return d11Team;
    }

    public void setD11Team(D11TeamBaseDTO d11Team) {
        this.d11Team = d11Team;
    }
    
}
