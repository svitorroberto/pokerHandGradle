package sequencia

import entidade.Card
import entidade.PokerHand
import entidade.Result

import static entidade.CardEnum.A

/**
 * Created by vitormiranda on 08/06/17.
 */
class StraightFlush implements Sequencia{
	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		Card.compare(PokerHand.retornaMaiorCarta(hand1), PokerHand.retornaMaiorCarta(hand2))
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		Flush f = new Flush()
		if (PokerHand.isSequency(hand) && f.isSequencia(hand)) {
			println("Straight Flush")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}

}
