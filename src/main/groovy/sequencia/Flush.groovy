package sequencia

import entidade.PokerHand
import entidade.Result

import static entidade.Card.sameNumber
import static entidade.Card.sameSuit

/**
 * Created by vitormiranda on 08/06/17.
 */
class Flush implements Sequencia {
	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		return null
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		HashMap cartasRepetidas = sameSuit(hand)
		if (cartasRepetidas.containsValue(5)) {
			println(hand.toString())
			println("Flush")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}
}
