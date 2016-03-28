/**
 * Created by Volodymyr.Gergel on 3/2/2016.
 */

/**
 * This program form massive of 36 or 52 cards, mix them
 * and add them to hand 1 by 1
 */

import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

public class CardDeck implements CardDeckInterface {
    public static void main(String[] args) throws IOException {
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

/** 52 cards to hand*/

    private static void cardsToHand52() throws IOException {
        int cardsInHand;
        System.out.println("CARDS IN HAND 52:");
        Writer writer = new FileWriter("output52.txt");
        for (cardsInHand = 0; cardsInHand < suit.length * rank52.length; cardsInHand++) {
            hand52[cardsInHand] = cardDeck52[cardsInHand];
            System.out.print(hand52[cardsInHand] + "   ");

                writer.write(hand52[cardsInHand] + "   ");

            cardDeck52[cardsInHand] = null;
            float a = (cardsInHand + 1) % 13;
            if (a == 0) {
                System.out.println();
            }
        }
        writer.close();
    }


    /** 36 cards to hand*/

    private static void cardsToHand36() throws IOException {
        int cardsInHand;
        System.out.println("CARDS IN HAND 36:");
        Writer writer = new FileWriter("output36.txt");
        for (cardsInHand = 0; cardsInHand < suit.length * rank36.length; cardsInHand++) {
            hand36[cardsInHand] = cardDeck36[cardsInHand];
            System.out.print(hand36[cardsInHand] + "   ");

            writer.write(hand36[cardsInHand]  + "   ");

            cardDeck36[cardsInHand] = null;
            float a = (cardsInHand + 1) % 9;
            if (a == 0) {
            System.out.println();
            }
        }
        writer.close();
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

    void in36() throws IOException {
        Reader reader = new FileReader("output36.txt");
        int i = 0;
        while(i < hand36.length) {
            reader.read( CharBuffer.wrap( hand36[i] ) );
            i++;
        }
        reader.close();
    }

    void in52() throws IOException {
        Reader reader = new FileReader("output52.txt");
        int i = 0;
        while(i < hand52.length) {
            reader.read( CharBuffer.wrap( hand52[i] ) );
            i++;
        }
        reader.close();
    }
}

