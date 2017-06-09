package sequencia

import entidade.Card
import entidade.CardEnum
import entidade.PokerHand
import entidade.Result

import static entidade.CardEnum.A

/**
 * Created by vitormiranda on 08/06/17.
 */
class RoyalStraightFlush implements Sequencia {
	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		Result.DRAW
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		Flush f = new Flush()
		if (PokerHand.isSequency(hand) && f.isSequencia(hand) && (PokerHand.retornaMaiorCarta(hand).number.equals(A))) {
			println("Royal Straight Flush")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}

	}

}
