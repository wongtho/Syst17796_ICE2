/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: ICE2: CardHand Object Class
 *  Due Date: March 7, 2021
 */
/**
 * This class creates your deck of cards
 */
public class CardHand {
        //specifies the deck size
        private int handSize = 60;
        //initialize number of cards in deck
	public Card[] cards = new Card[handSize];

        //sets card suit and values in order through for-each loop
        public void generateHand() {
            int countCards = 0;
            //for-each loop
            //loop through the number of suits
            for(Card.Suit s: Card.Suit.values()) {
                //loop through the number of values
                for(Card.Value v: Card.Value.values()) {
                    //set cards array of index countCards to s = suit, v = value
                    cards[countCards] = (new Card(s,v));
                    countCards++;
                }
            }//end outter for
        }//end method

}