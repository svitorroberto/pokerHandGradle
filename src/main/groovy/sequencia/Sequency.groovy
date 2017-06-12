package sequencia

import entidade.PokerHand
import entidade.Result

/**
 * Created by vitormiranda on 08/06/17.
 */
class Sequency implements Sequencia{
	@Override
	Result compararSequencias(PokerHand hand1, PokerHand hand2) {
		MaiorCarta maior = new MaiorCarta()
		return maior.compararSequencias(hand1, hand2)
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		return PokerHand.isSequency(hand)
	}
}
