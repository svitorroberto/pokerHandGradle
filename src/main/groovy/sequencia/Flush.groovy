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
	Result compararSequencias(PokerHand hand1, PokerHand hand2) {
		// carta mais alta
		MaiorCarta maior = new MaiorCarta()
		return maior.compararSequencias(hand1, hand2)
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
