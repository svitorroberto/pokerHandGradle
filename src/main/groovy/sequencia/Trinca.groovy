package sequencia

import entidade.Card
import entidade.PokerHand
import entidade.Result

import static entidade.Card.sameNumber

/**
 * Created by vitormiranda on 08/06/17.
 */
class Trinca implements Sequencia {
	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		//Hand possui 3 cartas (trinca)
		return Card.compare(PokerHand.retornaMaiorCarta(hand1), PokerHand.retornaMaiorCarta(hand2))
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		HashMap cartasRepetidas = sameNumber(hand)
		if (cartasRepetidas.containsValue(3)) {
			println(hand.toString())
			println("Trinca")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}
}
