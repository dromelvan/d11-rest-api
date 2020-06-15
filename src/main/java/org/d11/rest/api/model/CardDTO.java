package org.d11.rest.api.model;

public class CardDTO extends MatchEventDTO {

    private CardType cardType;

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
