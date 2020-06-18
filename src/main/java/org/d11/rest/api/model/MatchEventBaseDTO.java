package org.d11.rest.api.model;

public class MatchEventBaseDTO extends D11RestApiDTO {

    private int time;
    private int addedTime;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(int addedTime) {
        this.addedTime = addedTime;
    }

}
