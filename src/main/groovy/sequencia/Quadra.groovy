package sequencia

import entidade.Card
import entidade.CardEnum
import entidade.PokerHand
import entidade.Result

import static entidade.Card.sameNumber

/**
 * Created by vitormiranda on 08/06/17.
 */
class Quadra implements Sequencia {
	private static int QUADRA = 4

	@Override
	Result compararSequencias(PokerHand hand1, PokerHand hand2) {
		HashMap cartasRepetidas1 = sameNumber(hand1)
		CardEnum numero1 = numeroDaCarta(cartasRepetidas1)
		HashMap cartasRepetidas2 = sameNumber(hand2)
		CardEnum numero2 = numeroDaCarta(cartasRepetidas2)
		return Card.compare(new Card(numero1, null), new Card(numero2, null))
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		HashMap cartasRepetidas = sameNumber(hand)
		if (cartasRepetidas.containsValue(QUADRA)) {
			println(hand.toString())
			println("Quadra")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}

	CardEnum numeroDaCarta(Map cartasRepetidas){
		for (Map.Entry<Integer, String> entry : cartasRepetidas.entrySet()) {
			if (entry.getValue().equals(QUADRA)) {
				return entry.getKey()
			}
		}
	}
}
