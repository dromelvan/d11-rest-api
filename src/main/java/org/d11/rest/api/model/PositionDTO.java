package org.d11.rest.api.model;

public class PositionDTO extends D11RestApiDTO {

    private String name;
    private String code;
    private boolean defender;
    private int sortOrder;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isDefender() {
        return defender;
    }

    public void setDefender(boolean defender) {
        this.defender = defender;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

}
