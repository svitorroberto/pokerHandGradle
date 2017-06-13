import comunicacao.Poker
import entidade.Card
import entidade.PokerHand
import entidade.Result
import sequencia.DoisPares
import sequencia.Flush
import sequencia.FullHouse
import sequencia.MaiorCarta
import sequencia.RoyalStraightFlush
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by vitormiranda on 13/06/17.
 */
class ChecaSequencias extends Specification {

	@Unroll
	def "deve reconhecer RoyalStraightFlush em hand"() {
		given:
		def royalStraightFlush = new RoyalStraightFlush()
		and:
		PokerHand pokerHand = new PokerHand(hand)

		expect:
		royalStraightFlush.isSequencia(pokerHand) == result

		where:
		hand             || result
		"8S 7S 6S 5S 5S" || Boolean.FALSE
		"TC JS QH KS AD" || Boolean.FALSE
		"TD JD QD KD AD" || Boolean.TRUE
	}
	@Unroll
	def "deve reconhecer Flush em hand"() {
		given:
		def flush = new Flush()
		and:
		PokerHand pokerHand = new PokerHand(hand)

		expect:
		flush.isSequencia(pokerHand) == result

		where:
		hand             || result
		"8S 7S 6S 5S 5S" || Boolean.TRUE
		"TC JS QH KS AD" || Boolean.FALSE
		"TD JD QD KD AD" || Boolean.TRUE
	}
	@Unroll
	def "deve reconhecer FullHouse em hand"() {
		given:
		def fullHouse = new FullHouse()
		and:
		PokerHand pokerHand = new PokerHand(hand)

		expect:
		fullHouse.isSequencia(pokerHand) == result

		where:
		hand             || result
		"8S 8S 6S 5S 5S" || Boolean.FALSE
		"TC TS TH KS KD" || Boolean.TRUE
		"TD JD QD KD AD" || Boolean.FALSE
	}
	@Unroll
	def "deve reconhecer DoisPares em hand"() {
		given:
		def doisPares = new DoisPares()
		and:
		PokerHand pokerHand = new PokerHand(hand)

		expect:
		doisPares.isSequencia(pokerHand) == result

		where:
		hand             || result
		"8S 8S 6S 5S 5S" || Boolean.TRUE
		"TC TS TH KS KD" || Boolean.FALSE
		"TD JD QD KD AD" || Boolean.FALSE
	}
	@Unroll
	def "deve reconhecer maior carta dentre 2"() {

		expect:
		Card.compare(new Card(card1), new Card(card2)) == result

		where:
		card1 | card2 || result
		"8S"  | "TD"  || Result.LOSS
		"AS"  | "5D"  || Result.WIN
		"6S"  | "6D"  || Result.DRAW
		"2S"  | "2D"  || Result.DRAW
	}
	@Unroll
	def "deve retornar maior carta de uma PokeHand"() {

		expect:
		PokerHand.retornaMaiorCarta(hand) == new Card(result)

		where:
		hand             || result
		"8S 8S 6S 5S 5S" || "8S"
		"TC TS AH KS KD" || "AH"
		"TD JD QD KD 2D" || "KD"
	}
}
