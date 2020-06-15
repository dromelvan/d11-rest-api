package org.d11.rest.api.model;

public enum CardType {
    YELLOW(0, "Yellow"), RED(1, "Red");

    private int id;
    private String name;

    private CardType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static CardType withId(int id) {
        switch (id) {
        case 0:
            return CardType.YELLOW;
        case 1:
            return CardType.RED;
        default:
            return null;
        }
    }
}
