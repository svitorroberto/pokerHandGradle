package sequencia

import entidade.Card
import entidade.PokerHand
import entidade.Result

import static entidade.Card.sameNumber

/**
 * Created by vitormiranda on 08/06/17.
 */
class Par implements Sequencia {
	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		//Hand possui 2 cartas (par)
		return Card.compare(PokerHand.retornaMaiorCarta(hand1), PokerHand.retornaMaiorCarta(hand2))
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		HashMap cartasRepetidas = sameNumber(hand)
		if (cartasRepetidas.containsValue(2)) {
			println(hand.toString())
			println("Par")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}
}
