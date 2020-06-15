package org.d11.rest.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MatchMatchEventsDTO extends MatchDTO {

    // private Map<?,?> playerMatchStats = new HashMap<>();
    private List<GoalDTO> goals = new ArrayList<>();
    private List<CardDTO> cards = new ArrayList<>();
    private List<SubstitutionDTO> substitutions = new ArrayList<>();
    private Map<Integer, MatchEventsDTO> matchEvents = new HashMap<>();

//	public Map<?,?> getPlayerMatchStats() {
//		return playerMatchStats;
//	}
//
//	public void setPlayerMatchStats(Map<?,?> playerMatchStats) {
//		this.playerMatchStats = playerMatchStats;
//	}

    @JsonIgnore
    public List<GoalDTO> getGoals() {
        return goals;
    }

    public void setGoals(List<GoalDTO> goals) {
        this.goals = goals;
    }

    @JsonIgnore
    public List<CardDTO> getCards() {
        return cards;
    }

    public void setCards(List<CardDTO> cards) {
        this.cards = cards;
    }

    @JsonIgnore
    public List<SubstitutionDTO> getSubstitutions() {
        return substitutions;
    }

    public void setSubstitutions(List<SubstitutionDTO> substitutions) {
        this.substitutions = substitutions;
    }

    public Map<Integer, MatchEventsDTO> getMatchEvents() {
        this.matchEvents = new HashMap<Integer, MatchEventsDTO>();
        this.matchEvents.put(getHomeTeamId(), new MatchEventsDTO());
        this.matchEvents.put(getAwayTeamId(), new MatchEventsDTO());

        getGoals().forEach(goalDTO -> this.matchEvents.get(goalDTO.getTeamId()).getGoals().add(goalDTO));
        getCards().forEach(cardDTO -> this.matchEvents.get(cardDTO.getTeamId()).getCards().add(cardDTO));
        getSubstitutions().forEach(substitutionDTO -> this.matchEvents.get(substitutionDTO.getTeamId()).getSubstitutions().add(substitutionDTO));

        return this.matchEvents;
    }

}
