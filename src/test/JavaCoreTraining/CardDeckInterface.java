/**
 * Created by Volodymyr.Gergel on 3/15/2016.
 */
public interface CardDeckInterface {
    String[] suit = {"Spades", "Clubs", "Diamonds", "Hearts"};
    String[] rank36 = {"6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] rank52 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] cardDeck36 = new String[suit.length * rank36.length];
    String[] cardDeck52 = new String[suit.length * rank52.length];
    String[] hand36 = new String[cardDeck36.length];
    String[] hand52 = new String[cardDeck52.length];
}
