package edu.brainacad;

/**
 * Created by Admin on 13.03.2016.
 */
public class Main {

    public static void main(String[] args) {

        Card[] deck = new Card[52];
        int count = 0;

        for (Rank rank : Rank.values()) {

            for (Suit suit : Suit.values()) {
                deck[count] = new Card(rank, suit);
                System.out.println(deck[count]);
                count++;

            }
        }
    }
}