
public class GamePlayer {

	public static void main(String[] args) {
		CardHand ch = new CardHand();
                ch.generateHand();
                for(Card c: ch.cards)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
               // System.out.println(ch.cards); show what happens when there is no toString()
	}

}