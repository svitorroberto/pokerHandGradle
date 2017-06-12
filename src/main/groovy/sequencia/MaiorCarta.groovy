package sequencia

import entidade.Card
import entidade.PokerHand
import entidade.Result

import static entidade.PokerHand.retornaMaiorCarta

/**
 * Created by vitormiranda on 08/06/17.
 */
class MaiorCarta implements Sequencia {
	@Override
	Result compararSequencias(PokerHand hand1, PokerHand hand2) {
		def hand1Ordenada = hand1.cards.number.sort()
		def hand2Ordenada = hand2.cards.number.sort()
		for (int i = 0; i < hand1Ordenada.size(); i++) {
			def temp = Card.compare(new Card(hand1Ordenada.get(i), null), new Card(hand2Ordenada.get(i), null))
			if (temp != Result.DRAW) {
				return temp
			}
		}
		return Result.DRAW
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		Boolean.TRUE
	}

}
