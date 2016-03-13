package edu.brainacad;

/**
 * Created by Admin on 13.03.2016.
 */
public class Card {
    private Rank cardSuiT;
    private Suit cardRank;

    public Card(Rank cardSuiT, Suit cardRank) {
        this.cardSuiT = cardSuiT;
        this.cardRank = cardRank;
    }

    @Override
    public String
    toString() {
        return "The Card:" + ""
                + cardSuiT + "_" + cardRank;
    }
}
