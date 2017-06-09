package sequencia

import entidade.Card
import entidade.PokerHand
import entidade.Result

import static entidade.Card.sameNumber

/**
 * Created by vitormiranda on 08/06/17.
 */
class Quadra implements Sequencia {
	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		return null
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		Card.isHiger(hand.cards.get(0), hand.cards.get(1))
		HashMap cartasRepetidas = sameNumber(hand)
		if (cartasRepetidas.containsValue(4)) {
			println(hand.toString())
			println("Quadra")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}
}
