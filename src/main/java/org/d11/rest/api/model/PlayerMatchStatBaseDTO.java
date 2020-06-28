package org.d11.rest.api.model;

public class PlayerMatchStatBaseDTO extends PlayerStatDTO {

    private String playedPosition;
    private int lineup;
    private int substitutionOnTime;
    private int substitutionOffTime;
    private int yellowCardTime;
    private int redCardTime;
    private boolean manOfTheMatch;
    private boolean sharedManOfTheMatch;

    public String getPlayedPosition() {
        return playedPosition;
    }

    public void setPlayedPosition(String playedPosition) {
        this.playedPosition = playedPosition;
    }

    public int getLineup() {
        return lineup;
    }

    public void setLineup(int lineup) {
        this.lineup = lineup;
    }

    public int getSubstitutionOnTime() {
        return substitutionOnTime;
    }

    public void setSubstitutionOnTime(int substitutionOnTime) {
        this.substitutionOnTime = substitutionOnTime;
    }

    public int getSubstitutionOffTime() {
        return substitutionOffTime;
    }

    public void setSubstitutionOffTime(int substitutionOffTime) {
        this.substitutionOffTime = substitutionOffTime;
    }

    public int getYellowCardTime() {
        return yellowCardTime;
    }

    public void setYellowCardTime(int yellowCardTime) {
        this.yellowCardTime = yellowCardTime;
    }

    public int getRedCardTime() {
        return redCardTime;
    }

    public void setRedCardTime(int redCardTime) {
        this.redCardTime = redCardTime;
    }

    public boolean isManOfTheMatch() {
        return manOfTheMatch;
    }

    public void setManOfTheMatch(boolean manOfTheMatch) {
        this.manOfTheMatch = manOfTheMatch;
    }

    public boolean isSharedManOfTheMatch() {
        return sharedManOfTheMatch;
    }

    public void setSharedManOfTheMatch(boolean sharedManOfTheMatch) {
        this.sharedManOfTheMatch = sharedManOfTheMatch;
    }

}
