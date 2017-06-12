package sequencia

import entidade.Card
import entidade.PokerHand
import entidade.Result

import static entidade.Card.sameNumber

/**
 * Created by vitormiranda on 08/06/17.
 */
class DoisPares implements Sequencia {

	@Override
	Result compararSequencias(PokerHand hand1, PokerHand hand2) {
		Par p = new Par()
		HashMap cartasRepetidas1 = sameNumber(hand1)
		HashMap cartasRepetidas2 = sameNumber(hand2)

		Result resultDupla = p.compararSequencias(hand1, hand2)
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		HashMap cartasRepetidas = sameNumber(hand)
		def result = cartasRepetidas.findAll { it.value == 2 }
		SortedSet<Card> keys = new TreeSet<Card>(cartasRepetidas.keySet());
		if (result.size() == 2) {
			println(hand.toString())
			println("Dois Pares")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}
}