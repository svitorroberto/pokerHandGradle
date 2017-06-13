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

	static Boolean isSequency(PokerHand hand){
		def handOrdenada = hand.cards.number.sort()
		int index = Collections.indexOfSubList(CardEnum.values() as List, handOrdenada);
		if(index >= 0){Boolean.TRUE}
		else{Boolean.FALSE}
	}

	static Card retornaMaiorCarta(PokerHand hand){
		def handOrdenada = hand.cards.number.sort().reverse()
		return hand.cards.find {it.number == handOrdenada.get(0)}
	}

	@Override
	String toString() {
		String hand = ""
			this.cards.each { hand += "["+it.number+" "+it.suit+"] "}
		return hand

	}
}
