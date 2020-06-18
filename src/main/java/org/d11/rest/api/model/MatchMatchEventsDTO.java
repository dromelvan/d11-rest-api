package org.d11.rest.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MatchMatchEventsDTO extends MatchDTO {

    private List<GoalDTO> goals = new ArrayList<>();
    private List<CardDTO> cards = new ArrayList<>();
    private List<SubstitutionDTO> substitutions = new ArrayList<>();

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

    public Map<Long, MatchEventsDTO> getMatchEvents() {
        Map<Long, MatchEventsDTO> matchEvents = new HashMap<>();
        matchEvents.put(getHomeTeam().getId(), new MatchEventsDTO());
        matchEvents.put(getAwayTeam().getId(), new MatchEventsDTO());

        getGoals().forEach(goalDTO -> matchEvents.get((long) goalDTO.getTeam().getId()).getGoals().add(goalDTO));
        getCards().forEach(cardDTO -> matchEvents.get((long) cardDTO.getTeam().getId()).getCards().add(cardDTO));
        getSubstitutions().forEach(substitutionDTO -> matchEvents.get((long) substitutionDTO.getTeam().getId()).getSubstitutions().add(substitutionDTO));

        return matchEvents;
    }

}
