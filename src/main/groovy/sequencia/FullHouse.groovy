package sequencia

import entidade.Card
import entidade.CardEnum
import entidade.PokerHand
import entidade.Result

import static entidade.Card.sameNumber

/**
 * Created by vitormiranda on 08/06/17.
 */
class FullHouse implements Sequencia{
	private static int PAR = 2
	private static int TRINCA = 3

	@Override
	Result compararSequencias(PokerHand hand1, PokerHand hand2) {
		Trinca t = new Trinca()
		Par p = new Par()

		Result resultTrinca = t.compararSequencias(hand1, hand2)
		if (resultTrinca == Result.DRAW){
			return p.compararSequencias(hand1, hand2)
		} else { resultTrinca }

	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		HashMap cartasRepetidas = sameNumber(hand)
		if (cartasRepetidas.containsValue(2) && cartasRepetidas.containsValue(3)) {
			println(hand.toString())
			println("Full House")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}
}
