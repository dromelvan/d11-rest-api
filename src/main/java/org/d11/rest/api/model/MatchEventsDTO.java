package org.d11.rest.api.model;

import java.util.*;

import lombok.Data;

@Data
public class MatchEventsDTO {

    private List<GoalDTO> goals = new ArrayList<>();
    private List<CardDTO> cards = new ArrayList<>();
    private List<SubstitutionDTO> substitutions = new ArrayList<>();

}
