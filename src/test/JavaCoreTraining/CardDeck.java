/**
 * Created by Volodymyr.Gergel on 3/2/2016.
 */

import java.util.*;

public class CardDeck implements CardDeckInterface {
    public static void main(String[] args) {
        String buffer;
        int numberOfCards = 0;
        int cardsInHand = 0;

        initial36( numberOfCards );
        numberOfCards = 0;
        initial52( numberOfCards );

        // mixing

        mix36();

        mix52();

        // Hand

        cardsToHand36();

        cardsToHand52();

    }

    private static void cardsToHand52() {
        int cardsInHand;
        System.out.println("CARDS IN HAND 52:");
        for (cardsInHand = 0; cardsInHand < suit.length * rank52.length; cardsInHand++) {
            hand52[cardsInHand] = cardDeck52[cardsInHand];
            System.out.print(hand52[cardsInHand] + "   ");
            cardDeck52[cardsInHand] = null;
            float a = (cardsInHand + 1) % 13;
            if (a == 0) {
                System.out.println();
            }
        }
    }

    private static void cardsToHand36() {
        int cardsInHand;
        System.out.println("CARDS IN HAND 36:");
        for (cardsInHand = 0; cardsInHand < suit.length * rank36.length; cardsInHand++) {
            hand36[cardsInHand] = cardDeck36[cardsInHand];
            System.out.print(hand36[cardsInHand] + "   ");
            cardDeck36[cardsInHand] = null;
            float a = (cardsInHand + 1) % 9;
            if (a == 0) {
            System.out.println();
            }
        }

        System.out.println();
    }

    private static void mix52() {
        String buffer;Random rand52 = new Random();
        for (int i = 0; i < suit.length * rank52.length; i++) {
            int randIndex = rand52.nextInt(suit.length * rank52.length);
            buffer = cardDeck52[randIndex];
            cardDeck52[randIndex] = cardDeck52[i];
            cardDeck52[i] = buffer;
        }

        System.out.println("MIXED CARD DECK 52:");
        for (int i = 0; i < suit.length * rank52.length; i++) {
            System.out.print(cardDeck52[i] + "   ");
            float a = (i + 1) % 13;
            if (a == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    private static void mix36() {
        String buffer;Random rand36 = new Random();
        for (int i = 0; i < suit.length * rank36.length; i++) {
            int randIndex = rand36.nextInt(suit.length * rank36.length);
            buffer = cardDeck36[randIndex];
            cardDeck36[randIndex] = cardDeck36[i];
            cardDeck36[i] = buffer;
        }

        System.out.println("MIXED CARD DECK 36:");
        for (int i = 0; i < suit.length * rank36.length; i++) {
            System.out.print(cardDeck36[i] + "   ");
            float a = (i + 1) % 9;
            if (a == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    private static void initial52(int numberOfCards) {
        System.out.println("CARD DECK 52:");

        for (String aSuit : suit) {
            for (String aRank : rank52) {
                cardDeck52[numberOfCards] = aSuit + " " + aRank;
                System.out.print(cardDeck52[numberOfCards] + "   ");
                numberOfCards++;
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void initial36(int numberOfCards) {
        System.out.println("CARD DECK 36:");

        for (String aSuit : suit) {
            for (String aRank : rank36) {
                cardDeck36[numberOfCards] = aSuit + " " + aRank;
                System.out.print(cardDeck36[numberOfCards] + "   ");
                numberOfCards++;
            }
            System.out.println();
        }

        System.out.println();

    }

}
