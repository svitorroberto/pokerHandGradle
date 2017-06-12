package comunicacao

import entidade.PokerHand
import entidade.Result
import negocio.PokerNegocio


/**
 * Created by vitormiranda on 08/06/17.
 */
class Poker {

	Result comparar (PokerHand hand1, PokerHand hand2){
		PokerNegocio pn = new PokerNegocio();
		return pn.verificarSequencias(hand1,hand2)
	}
/*
	Result comparar2 (PokerHand hand1, PokerHand hand2){
		PokerNegocio pn = new PokerNegocio();
		return pn.verificarSequenciasTop(hand1,hand2)
	}
*/
}
