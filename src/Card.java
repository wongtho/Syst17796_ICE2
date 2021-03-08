/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: ICE2: Card Object Class
 *  Due Date: March 7, 2021
 */
/**
 * This class is the object of the cards
 */
/**
 * Task 4:
 * The Card class and CardHand class uses Encapsulation to separate the Card object and the CardDeck (CardHand) object from
 * each other. This improves code reusability by having the Card class model 1 single card and the CardHand class simply calls
 * the Card class the DeckSize number of times to complete a full deck of cards.
 *  CardHand.handSize is private and only visible within its own class
 *  Card.Suit and Card.Value is likewise only visible within its own class
 */
/**
 * Task 5:
 * Since Card class and CardHand class is implemented separately, this package can be reused to simulate a card game between players
 * instead of having CardHand class generate a full deck, a starting set of 5 random cards could be generated with a constructor to 
 * simulate the starting hand of the player. A pickCard/dealCard method can be implemented in the cardHand class to simulate a player 
 * playing a card game.
 * The Card class is fine as is since it is a card object that creates 1 card.
 */
public class Card {
        //create UNO card properties
        public enum Suit {RED, YELLOW, GREEN, BLUE};
        public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
        private final Suit suit;
        private final Value value;
        //constructor method
        public Card(Suit s, Value gVal) {
           suit = s;
           value = gVal;
        }
        //getter methods
	public Value getValue() {
		return this.value;
	}
	public Suit getSuit() {
		return this.suit;
        }
}