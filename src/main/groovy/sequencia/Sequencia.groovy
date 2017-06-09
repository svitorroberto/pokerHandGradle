package sequencia

import entidade.PokerHand
import entidade.Result

/**
 * Created by vitormiranda on 08/06/17.
 */
interface Sequencia {

	Result comparar (PokerHand hand1, PokerHand hand2)
	Boolean isSequencia (PokerHand hand1)

}