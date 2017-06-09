package sequencia

import entidade.PokerHand
import entidade.Result

/**
 * Created by vitormiranda on 08/06/17.
 */
class StraightFlush implements Sequencia{
	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		return null
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		Flush f = new Flush()
		return PokerHand.isSequency(hand) && f.isSequencia(hand)
	}
}
