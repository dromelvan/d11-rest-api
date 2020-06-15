package org.d11.rest.api.model;

import java.util.ArrayList;
import java.util.List;

public class MatchEventsDTO {

	private List<GoalDTO> goals = new ArrayList<>();
	private List<CardDTO> cards = new ArrayList<>();
	private List<SubstitutionDTO> substitutions = new ArrayList<>();

	public List<GoalDTO> getGoals() {
		return goals;
	}
	
	public void setGoals(List<GoalDTO> goals) {
		this.goals = goals;
	}
	
	public List<CardDTO> getCards() {
		return cards;
	}
	
	public void setCards(List<CardDTO> cards) {
		this.cards = cards;
	}
	
	public List<SubstitutionDTO> getSubstitutions() {
		return substitutions;
	}
	
	public void setSubstitutions(List<SubstitutionDTO> substitutions) {
		this.substitutions = substitutions;
	}
	
}
