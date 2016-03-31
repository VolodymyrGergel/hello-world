/**
 * Created by Volodymyr.Gergel on 3/2/2016.
 */


import java.io.*;
import java.nio.CharBuffer;
import java.util.*;
import java.util.Scanner;

public class CardDeck implements CardDeckInterface {
    public static void main(String[] args) throws IOException {
        String buffer;
        int numberOfCards = 0;
        int cardsInHand = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to play 36 or 52 card deck? Please type 36 or 52");
        int yourDeck = scanner.nextInt();

        //if (yourDeck != 36 || yourDeck != 52 ) {
        //    yourDeck = scanner.nextInt();
        //}
        if (yourDeck == 36) {
           initial36( numberOfCards );
           System.out.println("Your deck is ready. Do you want to get the cards (1), shuffle deck (2) or display the deck (3)?");
            possibleChoice( numberOfCards, scanner, yourDeck );
            anythingElse( numberOfCards, scanner, yourDeck);
        }
        if (yourDeck == 52) {
            initial52( numberOfCards );
            System.out.println("Your deck is ready. Do you want to get the cards (1), shuffle deck (2) or display the deck (3)?");
            possibleChoice( numberOfCards, scanner, yourDeck );
            anythingElse( numberOfCards, scanner, yourDeck);
        }
    }

    private static void anythingElse(int numberOfCards, Scanner scanner, int yourDeck) throws IOException {
        System.out.println("Anything else? Yes(1)/No(2)");
        int yesNo = scanner.nextInt();
        if (yesNo == 1) {
            System.out.println("Do you want to get the cards (1), shuffle deck (2) or display the deck (3)?");
            possibleChoice ( numberOfCards, scanner, yourDeck);
            anythingElse( numberOfCards, scanner, yourDeck);
        } else if (yesNo == 2 ) {
            System.out.println("Good luck!");
        }
    }

    private static void possibleChoice(int numberOfCards, Scanner scanner, int yourDeck) throws IOException {
        int yourChoise = scanner.nextInt();

        if (yourChoise == 1) {
            if (yourDeck == 36){
                cardsToHand36();
            }

            if (yourDeck == 52){
                cardsToHand52();
            }

        }

        if (yourChoise == 2) {
            if (yourDeck == 36) {
                mix36();
            }

            if (yourDeck == 52) {
                mix52();
            }
        }

        if (yourChoise == 3) {
            if (yourDeck == 36){
                printInitial36( numberOfCards );
            }

            if (yourDeck == 52){
                printInitial52( numberOfCards );
            }

        }
        System.out.println();
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
            //cardDeck52[cardsInHand] = null;
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
            //cardDeck36[cardsInHand] = null;
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

        for (String aSuit : suit) {
            for (String aRank : rank52) {
                cardDeck52[numberOfCards] = aSuit + " " + aRank;
                numberOfCards++;
            }
        }
        numberOfCards = 0;
    }

    private static void printInitial52(int numberOfCards) {
        System.out.println("CARD DECK 52:");

        for (String aSuit : suit) {
            for (String aRank : rank52) {
                System.out.print(cardDeck52[numberOfCards] + "   ");
                numberOfCards++;
            }
            System.out.println();
        }

        System.out.println();
        numberOfCards = 0;
    }

    private static void initial36(int numberOfCards) {

        for (String aSuit : suit) {
            for (String aRank : rank36) {
                cardDeck36[numberOfCards] = aSuit + " " + aRank;
                numberOfCards++;
            }
        }
        numberOfCards = 0;
    }

    private static void printInitial36(int numberOfCards) {
        System.out.println("CARD DECK 36:");

        for (String aSuit : suit) {
            for (String aRank : rank36) {
                System.out.print(cardDeck36[numberOfCards] + "   ");
                numberOfCards++;
            }
            System.out.println();
        }

        System.out.println();
        numberOfCards = 0;
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

