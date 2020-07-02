package org.d11.rest.api.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Setter;

public class MatchMatchEventsDTO extends MatchDTO {

    @Setter
    private List<GoalDTO> goals = new ArrayList<>();
    @Setter
    private List<CardDTO> cards = new ArrayList<>();
    @Setter
    private List<SubstitutionDTO> substitutions = new ArrayList<>();

    @JsonIgnore
    public List<GoalDTO> getGoals() {
        return goals;
    }

    @JsonIgnore
    public List<CardDTO> getCards() {
        return cards;
    }

    @JsonIgnore
    public List<SubstitutionDTO> getSubstitutions() {
        return substitutions;
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
