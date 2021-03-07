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