package sequencia

import entidade.Card
import entidade.PokerHand
import entidade.Result

import static entidade.PokerHand.retornaMaiorCarta

/**
 * Created by vitormiranda on 08/06/17.
 */
class MaiorCarta implements Sequencia{
	@Override
	Result comparar(PokerHand hand1, PokerHand hand2) {
		def hand1Ordenada = hand1.cards.number.sort()
		def hand2Ordenada = hand2.cards.number.sort()
		for(int i=0;i<hand1Ordenada.size();i++){
			def temp = Card.compare(hand1Ordenada.get(1),hand2Ordenada.get(1))
			if(temp != Result.DRAW){return temp}
		}
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		null
	}

	Card verificaMaiorCarta (PokerHand hand){

		return retornaMaiorCarta(hand)
	}

}
