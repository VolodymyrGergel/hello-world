/**
 * Created by Volodymyr.Gergel on 3/2/2016.
 */

import java.util.*;

public class CardDeck {
    public static void main(String[] args) {
        String[] rank = {"6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suit = {"Spades", "Clubs", "Diamonds", "Hearts"};
        String[] card = new String[suit.length * rank.length];
        String buffer = new String();
        String[] hand = new String[card.length];
        int numberOfCards = 0;
        int cardsInHand = 0;

        System.out.println("CARD DECK:");
        for (String aSuit : suit) {
            for (String aRank : rank) {
                card[numberOfCards] = aSuit + " " + aRank;
                System.out.print(card[numberOfCards] + "   ");
                numberOfCards++;
            }
            System.out.println();
        }

        System.out.println();

        // mixing

        Random rand = new Random();
        for (int i = 0; i < suit.length * rank.length; i++) {
            int randIndex = rand.nextInt(suit.length * rank.length);
            buffer = card[randIndex];
            card[randIndex] = card[i];
            card[i] = buffer;
        }

        System.out.println("MIXED CARD DECK:");
        for (int i = 0; i < suit.length * rank.length; i++) {
            System.out.print(card[i] + "   ");
            float a = (i + 1) % 9;
            if (a == 0) {
                System.out.println();
            }
        }

        System.out.println();

        // Hand

        System.out.println("CARDS IN HAND:");
        for (cardsInHand = 0; cardsInHand < suit.length * rank.length; cardsInHand++) {
            hand[cardsInHand] = card[cardsInHand];
            System.out.print(hand[cardsInHand] + "   ");
            card[cardsInHand] = null;
            float a = (cardsInHand + 1) % 9;
            if (a == 0) {
            System.out.println();
            }
        }

    }

}
