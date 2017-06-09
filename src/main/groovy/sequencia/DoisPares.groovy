package sequencia

import entidade.PokerHand
import entidade.Result

import static entidade.Card.sameNumber

/**
 * Created by vitormiranda on 08/06/17.
 */
class DoisPares implements Sequencia {

	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		return null
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		HashMap cartasRepetidas = sameNumber(hand)
		def result = cartasRepetidas.findAll { it.value == 2 }
		if (result.size() == 2) {
			println(hand.toString())
			println("Dois Pares")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}
}