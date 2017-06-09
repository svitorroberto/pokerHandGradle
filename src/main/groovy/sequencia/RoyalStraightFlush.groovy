package sequencia

import entidade.CardEnum
import entidade.PokerHand
import entidade.Result

/**
 * Created by vitormiranda on 08/06/17.
 */
class RoyalStraightFlush implements Sequencia {
	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		return null
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		CardEnum.MAX_VALUE
	}

}
