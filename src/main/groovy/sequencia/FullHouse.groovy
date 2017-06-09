package sequencia

import entidade.PokerHand
import entidade.Result

import static entidade.Card.sameNumber

/**
 * Created by vitormiranda on 08/06/17.
 */
class FullHouse implements Sequencia{
	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		return null
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		HashMap cartasRepetidas = sameNumber(hand)
		if (cartasRepetidas.containsValue(2) && cartasRepetidas.containsValue(3)) {
			println(hand.toString())
			println("Full House")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}
}
