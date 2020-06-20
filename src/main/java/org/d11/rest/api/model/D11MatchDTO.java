package org.d11.rest.api.model;

import java.util.*;

public class D11MatchDTO extends D11MatchBaseDTO {

    private D11TeamBaseDTO homeD11Team;
    private D11TeamBaseDTO awayD11Team;
    private D11MatchDayBaseDTO d11MatchDay;
    private Map<Long, Long> remainingPlayerCount = new HashMap<>();

    public D11TeamBaseDTO getHomeD11Team() {
        return homeD11Team;
    }

    public void setHomeD11Team(D11TeamBaseDTO homeD11Team) {
        this.homeD11Team = homeD11Team;
    }

    public D11TeamBaseDTO getAwayD11Team() {
        return awayD11Team;
    }

    public void setAwayD11Team(D11TeamBaseDTO awayD11Team) {
        this.awayD11Team = awayD11Team;
    }

    public D11MatchDayBaseDTO getD11MatchDay() {
        return d11MatchDay;
    }

    public void setD11MatchDay(D11MatchDayBaseDTO d11MatchDay) {
        this.d11MatchDay = d11MatchDay;
    }

    public Map<Long, Long> getRemainingPlayerCount() {
        return remainingPlayerCount;
    }

    public void setRemainingPlayerCount(Map<Long, Long> remainingPlayerCount) {
        this.remainingPlayerCount = remainingPlayerCount;
    }

}
