package org.d11.rest.api.model;

public class SubstitutionDTO extends MatchEventDTO {

    private int playerInId;
    private String playerInName;
    private String playerInLastName;
    private String playerInShortName;
	
    public int getPlayerInId() {
		return playerInId;
	}
	
    public void setPlayerInId(int playerInId) {
		this.playerInId = playerInId;
	}
	
    public String getPlayerInName() {
		return playerInName;
	}
	
    public void setPlayerInName(String playerInName) {
		this.playerInName = playerInName;
	}
    
	public String getPlayerInLastName() {
		return playerInLastName;
	}

	public void setPlayerInLastName(String playerInLastName) {
		this.playerInLastName = playerInLastName;
	}

	public String getPlayerInShortName() {
		return playerInShortName;
	}

	public void setPlayerInShortName(String playerInShortName) {
		this.playerInShortName = playerInShortName;
	}	
        
}
