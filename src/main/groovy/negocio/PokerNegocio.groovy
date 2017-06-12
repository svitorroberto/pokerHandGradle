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
import sequencia.Sequencia
import sequencia.Sequency
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
	def tipoDeSequencia = [RoyalStraightFlush.class, StraightFlush.class, Quadra.class, FullHouse.class, Flush.class, Sequency.class, Trinca.class, DoisPares.class, Par.class, MaiorCarta.class] as ArrayList

	Result verificarSequencias (PokerHand hand1, PokerHand hand2){
		Result result

			tipoDeSequencia.find {
				result = compararMaos(hand1, hand2, it, Boolean.FALSE)
				if(result != Result.NONE){ return  result}
			}
		return result
	}

	private Result compararMaos(PokerHand hand1, PokerHand hand2, Class<Sequencia> c, Boolean desempate) {
		def r = c.newInstance()
		if(!desempate)
		{
			def resultado = compararPorSequencia(r.isSequencia(hand1), r.isSequencia(hand2))
			if(resultado == Result.WIN || resultado == Result.LOSS){return resultado}
			else if (resultado == Result.DRAW){compararMaos(hand1, hand2, c, Boolean.TRUE)}
			else {return resultado}
		}
		else{
			def resultado = r.compararSequencias(hand1, hand2)
			if(resultado == Result.WIN || resultado == Result.LOSS){return resultado}
			else if(resultado == Result.NONE){return Result.DRAW}
			else{return desempateMaiorCarta(hand1, hand2)}
		}
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

	private Result desempateMaiorCarta(PokerHand hand1, PokerHand hand2){
		MaiorCarta m = new MaiorCarta()
		return m.compararSequencias(hand1, hand2)
	}


}
