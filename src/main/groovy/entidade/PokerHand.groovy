package entidade

/**
 * Created by vitormiranda on 06/06/17.
 */
class PokerHand {
	ArrayList<Card> cards

	PokerHand(String hand) {
		cards = new ArrayList<>();
		String[] cartasString = hand.split()

		for(carta in cartasString){
			this.cards.add(new Card(carta))
		}
	}
}
