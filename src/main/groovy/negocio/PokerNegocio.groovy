package negocio

import entidade.Card
import entidade.PokerHand
import entidade.Result

import static entidade.Card.*

/**
 * Created by vitormiranda on 08/06/17.
 */
class PokerNegocio {

	private Boolean temSequencia1
	private Boolean temSequencia2
	private Result resultado

	Result verificarSequencias (PokerHand hand1, PokerHand hand2){
//		(compararPorSequencia(temSequencia1, temSequencia2) != Result.DRAW) ? return Result.DRAW : return Result.DRAW
		resultado = compararPorSequencia(verificarRoyalStraightFlush(hand1), verificarRoyalStraightFlush(hand2))
		if(resultado != Result.DRAW){resultado}
		//verificarStraightFlush
		resultado = compararPorSequencia(verificarStraightFlush(hand1), verificarStraightFlush(hand2))
		if(resultado != Result.DRAW){resultado}
		//verificarQuadra
		resultado = compararPorSequencia(verificarQuadra(hand1), verificarQuadra(hand2))
		if(resultado != Result.DRAW){resultado}
		//verificarFullHouse
		resultado = compararPorSequencia(verificarFullHouse(hand1), verificarFullHouse(hand2))
		if(resultado != Result.DRAW){resultado}
		//verificarFlush
		resultado = compararPorSequencia(verificarFlush(hand1), verificarFlush(hand2))
		if(resultado != Result.DRAW){resultado}
		//verificarSequency
		resultado = compararPorSequencia(verificarSequency(hand1), verificarSequency(hand2))
		if(resultado != Result.DRAW){resultado}
		//verificarTrinca
		resultado = compararPorSequencia(verificarTrinca(hand1), verificarTrinca(hand2))
		if(resultado != Result.DRAW){resultado}
		//verificarDoisPares
		resultado = compararPorSequencia(verificarDoisPares(hand1), verificarDoisPares(hand2))
		if(resultado != Result.DRAW){resultado}
		//verificarPar
		resultado = compararPorSequencia(verificarPar(hand1), verificarPar(hand2))
		if(resultado != Result.DRAW){resultado}
		//verificarMaiorCarta
		resultado = compararPorSequencia(verificarMaiorCarta(hand1), verificarMaiorCarta(hand2))
		if(resultado != Result.DRAW){resultado}

	}

	private Result compararPorSequencia(boolean temSequencia1, boolean temSequencia2) {
		if (temSequencia1) {
			if (temSequencia1.equals(temSequencia2)) {
				return Result.DRAW
			} else {
				return Result.WIN
			}
		} else {
			if (temSequencia2) {
				return Result.LOSS
			} else {
				return Result.DRAW
			}
		}
	}

	private Boolean verificarRoyalStraightFlush(PokerHand hand){
		Boolean.FALSE
	}
	private Boolean verificarStraightFlush(PokerHand hand){
		Boolean.FALSE
	}
	private Boolean verificarQuadra(PokerHand hand){
		HashMap cartasRepetidas = sameNumber(hand)
		if(cartasRepetidas.containsValue(4)){
			println("Quadra")
			Boolean.TRUE
		}
		else{Boolean.FALSE}
	}
	private Boolean verificarFullHouse(PokerHand hand){
		Boolean.FALSE
	}
	private Boolean verificarFlush(PokerHand hand){
		HashMap cartasRepetidas = sameNumber(hand)
		if(cartasRepetidas.containsValue(5)){
			println("Flush")
			Boolean.TRUE
		}
		else{Boolean.FALSE}
	}
	private Boolean verificarSequency(PokerHand hand){
		Boolean.FALSE
	}
	private Boolean verificarTrinca(PokerHand hand){
		HashMap cartasRepetidas = sameNumber(hand)
		if(cartasRepetidas.containsValue(3)){
			println("Trinca")
			Boolean.TRUE
		}
		else{Boolean.FALSE}
	}
	private Boolean verificarDoisPares(PokerHand hand){
		Boolean.FALSE
	}
	private Boolean verificarPar(PokerHand hand){
		HashMap cartasRepetidas = sameNumber(hand)
		def result = cartasRepetidas.findAll {it.value == 2}
		if(result.size() == 2){
			println("Dois Pares")
			Boolean.TRUE
		}
		else{Boolean.FALSE}
	}
	private Boolean verificarMaiorCarta(PokerHand hand){
		Boolean.FALSE
	}

	private Boolean desempateMaiorCarta(PokerHand hand1, PokerHand hand2){

	}
}
