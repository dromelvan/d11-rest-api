package org.d11.rest.api.model;

public class MatchDTO extends MatchBaseDTO {

    private TeamBaseDTO homeTeam;
    private TeamBaseDTO awayTeam;
    private MatchDayBaseDTO matchDay;
    private StadiumDTO stadium;

    public TeamBaseDTO getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(TeamBaseDTO homeTeam) {
        this.homeTeam = homeTeam;
    }

    public TeamBaseDTO getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(TeamBaseDTO awayTeam) {
        this.awayTeam = awayTeam;
    }

    public MatchDayBaseDTO getMatchDay() {
        return matchDay;
    }

    public void setMatchDay(MatchDayBaseDTO matchDay) {
        this.matchDay = matchDay;
    }

    public StadiumDTO getStadium() {
        return stadium;
    }

    public void setStadium(StadiumDTO stadium) {
        this.stadium = stadium;
    }

}
