package org.d11.rest.api.model;

public class TeamDTO extends TeamNameDTO {

    private int stadiumId;
    private String stadiumName;
    private int whoScoredId;
    private String nickname;
    private int established;
    private String motto;
    private String colour;
    private boolean dummy;

    public int getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(int stadiumId) {
        this.stadiumId = stadiumId;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public int getWhoScoredId() {
        return whoScoredId;
    }

    public void setWhoScoredId(int whoScoredId) {
        this.whoScoredId = whoScoredId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getEstablished() {
        return established;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isDummy() {
        return dummy;
    }

    public void setDummy(boolean dummy) {
        this.dummy = dummy;
    }

}
