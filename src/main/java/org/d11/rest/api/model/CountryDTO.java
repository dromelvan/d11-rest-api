package org.d11.rest.api.model;

public class CountryDTO extends D11RestApiDTO {

    private String name;
    private String iso;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

}
