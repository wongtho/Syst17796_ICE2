/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: ICE2: Driver Class
 *  Due Date: March 7, 2021
 */
public class GamePlayer {
	public static void main(String[] args) {
                //creates cardHand object
		CardHand ch = new CardHand();
                //generate card deck
                ch.generateHand();
                //loop through ch array of size ch.handSize note: handSize is private
                //for-each loop through array
                for(Card c: ch.cards) {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
//               System.out.println(ch.cards); 
//                  show what happens when there is no toString()
//                  this will output the address of array
	}

}