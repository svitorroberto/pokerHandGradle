package entidade


/**
 * Created by vitormiranda on 06/06/17.
 */
class Card {
	CardEnum number
	SuitEnum suit

	Card(String carta){
		number = CardEnum.findByCode(carta[0])
		suit = carta[1]
	}

	static HashMap sameNumber(PokerHand hand){
		Map<CardEnum, Integer> contagem = new HashMap<CardEnum, Integer>();
		for(Card card : hand.cards){
			if(!contagem.containsKey(card.number)){
				contagem.put(card.number,0)
			}
			contagem.put(card.number,contagem.get(card.number)+1)
		}
			return contagem
	}

	static Boolean sameSuit(PokerHand hand){
		Map<CardEnum, Integer> contagem = new HashMap<CardEnum, Integer>();
		for(Card card : hand.cards){
			if(!contagem.containsKey(card.suit)){
				contagem.put(card.suit,0)
			}
			contagem.put(card.suit,contagem.get(card.suit)+1)
		}
		return contagem
	}

	static Result compare(Card card1, Card card2){
		def temp = card1.number.compareTo(card2.number)
		if(temp<0){Result.LOSS}
		if(temp==0){Result.DRAW}
		if(temp>0){Result.WIN}
	}

}
