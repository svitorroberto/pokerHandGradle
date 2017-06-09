package negocio

import entidade.Card
import entidade.PokerHand
import entidade.Result
import sequencia.DoisPares
import sequencia.Flush
import sequencia.FullHouse
import sequencia.MaiorCarta
import sequencia.Par
import sequencia.Quadra
import sequencia.RoyalStraightFlush
import sequencia.StraightFlush
import sequencia.Trinca

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
		if(resultado == Result.WIN || resultado == Result.LOSS){resultado}
//		else if (resultado == Result.DRAW){desempatePorSequencia(hand1, hand2)}
		//verificarStraightFlush
		resultado = compararPorSequencia(verificarStraightFlush(hand1), verificarStraightFlush(hand2))
		if(resultado == Result.WIN || resultado == Result.LOSS){resultado}
//		else if (resultado == Result.DRAW){desempatePorSequencia(hand1, hand2)}
		//verificarQuadra
		resultado = compararPorSequencia(verificarQuadra(hand1), verificarQuadra(hand2))
		if(resultado == Result.WIN || resultado == Result.LOSS){resultado}
//		else if (resultado == Result.DRAW){desempatePorSequencia(hand1, hand2)}
		//verificarFullHouse
		resultado = compararPorSequencia(verificarFullHouse(hand1), verificarFullHouse(hand2))
		if(resultado == Result.WIN || resultado == Result.LOSS){resultado}
//		else if (resultado == Result.DRAW){desempatePorSequencia(hand1, hand2)}
		//verificarFlush
		resultado = compararPorSequencia(verificarFlush(hand1), verificarFlush(hand2))
		if(resultado == Result.WIN || resultado == Result.LOSS){resultado}
//		else if (resultado == Result.DRAW){desempatePorSequencia(hand1, hand2)}
		//verificarSequency
		resultado = compararPorSequencia(verificarSequency(hand1), verificarSequency(hand2))
		if(resultado == Result.WIN || resultado == Result.LOSS){resultado}
//		else if (resultado == Result.DRAW){desempatePorSequencia(hand1, hand2)}
		//verificarTrinca
		resultado = compararPorSequencia(verificarTrinca(hand1), verificarTrinca(hand2))
		if(resultado == Result.WIN || resultado == Result.LOSS){resultado}
//		else if (resultado == Result.DRAW){desempatePorSequencia(hand1, hand2)}
		//verificarDoisPares
		resultado = compararPorSequencia(verificarDoisPares(hand1), verificarDoisPares(hand2))
		if(resultado == Result.WIN || resultado == Result.LOSS){resultado}
//		else if (resultado == Result.DRAW){desempatePorSequencia(hand1, hand2)}
		//verificarPar
		resultado = compararPorSequencia(verificarPar(hand1), verificarPar(hand2))
		if(resultado == Result.WIN || resultado == Result.LOSS){resultado}
//		else if (resultado == Result.DRAW){desempatePorSequencia(hand1, hand2)}
		//verificarMaiorCarta
		resultado = compararPorSequencia(verificarMaiorCarta(hand1), verificarMaiorCarta(hand2))
		if(resultado == Result.WIN || resultado == Result.LOSS){resultado}
//		else if (resultado == Result.DRAW){desempatePorSequencia(hand1, hand2)}

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
				return Result.NONE
			}
		}
	}

	private desempatePorSequencia(PokerHand hand1, PokerHand hand2) {

	}

	private Boolean verificarRoyalStraightFlush(PokerHand hand){
		RoyalStraightFlush sf = new RoyalStraightFlush()
		sf.isSequencia(hand)
	}
	private Boolean verificarStraightFlush(PokerHand hand){
		StraightFlush sf = new StraightFlush()
		sf.isSequencia(hand)
	}
	private Boolean verificarQuadra(PokerHand hand){
		Quadra q = new Quadra()
		q.isSequencia (hand)
	}
	private Boolean verificarFullHouse(PokerHand hand){
		FullHouse fh = new FullHouse()
		fh.isSequencia (hand)
	}
	private Boolean verificarFlush(PokerHand hand){
		Flush f = new Flush()
		f.isSequencia (hand)
	}
	private Boolean verificarSequency(PokerHand hand){
		PokerHand.isSequency(hand)
	}
	private Boolean verificarTrinca(PokerHand hand){
		Trinca t = new Trinca()
		t.isSequencia (hand)
	}
	private Boolean verificarDoisPares(PokerHand hand){
		DoisPares dp = new DoisPares()
		dp.isSequencia(hand)
	}
	private Boolean verificarPar(PokerHand hand){
		Par par = new Par()
		par.isSequencia (hand)
	}
	private Boolean verificarMaiorCarta(PokerHand hand){
		MaiorCarta mc = new MaiorCarta()
		mc.verificaMaiorCarta(hand)
	}

	private Boolean desempateMaiorCarta(PokerHand hand1, PokerHand hand2){

	}
}
