package entidade

/**
 * Created by vitormiranda on 06/06/17.
 */
enum CardEnum {
	DOIS('2'), TRES('3'), QUATRO('4'), CINCO('5'), SEIS('6'), SETE('7'), OITO('8'), NOVE('9'), DEZ('T'), J('J'), Q('Q'), K('K'), A('A')

	String codigo

	CardEnum(String codigo) {
		this.codigo = codigo
	}

	static CardEnum findByCode(String codigo){
		values().find {it.codigo == codigo}
	}
}