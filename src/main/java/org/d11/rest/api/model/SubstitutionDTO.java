package org.d11.rest.api.model;

public class SubstitutionDTO extends MatchEventDTO {

    private PlayerBaseDTO playerIn;

    public PlayerBaseDTO getPlayerIn() {
        return playerIn;
    }

    public void setPlayerIn(PlayerBaseDTO playerIn) {
        this.playerIn = playerIn;
    }

}
