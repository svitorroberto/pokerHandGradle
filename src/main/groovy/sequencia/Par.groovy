package sequencia

import entidade.Card
import entidade.CardEnum
import entidade.PokerHand
import entidade.Result

import static entidade.Card.sameNumber

/**
 * Created by vitormiranda on 08/06/17.
 */
class Par implements Sequencia {
	private static int PAR = 2

	@Override
	Result compararSequencias(PokerHand hand1, PokerHand hand2) {
		HashMap cartasRepetidas1 = sameNumber(hand1)
		List<CardEnum> numero1 = numeroDaCarta(cartasRepetidas1).sort().reverse()
		HashMap cartasRepetidas2 = sameNumber(hand2)
		List<CardEnum> numero2 = numeroDaCarta(cartasRepetidas2).sort().reverse()
		Result resultado
		if(numero1.size() == 1){
			resultado =  Card.compare(new Card(numero1.get(0), null), new Card(numero2.get(0), null))
		}else{
			resultado = Card.compare(new Card(numero1.get(0), null), new Card(numero2.get(0), null))
			if(resultado == Result.DRAW){
				resultado = Card.compare(new Card(numero1.get(1), null), new Card(numero2.get(1), null))
			}
		}
		return resultado
	}

	@Override
	Boolean isSequencia(PokerHand hand) {
		HashMap cartasRepetidas = sameNumber(hand)
		if (cartasRepetidas.containsValue(PAR)) {
			println(hand.toString())
			println("Par")
			Boolean.TRUE
		} else {
			Boolean.FALSE
		}
	}

	List<CardEnum> numeroDaCarta(Map cartasRepetidas){
		List<CardEnum> lista = new ArrayList<>()
		for (Map.Entry<Integer, String> entry : cartasRepetidas.entrySet()) {
			if (entry.getValue().equals(PAR)) {
				lista.add(entry.getKey())
			}
		}
		return lista
	}
}
