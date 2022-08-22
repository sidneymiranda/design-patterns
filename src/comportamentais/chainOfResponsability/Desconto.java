package chainOfResponsability;

import java.math.BigDecimal;


/**
 * 
 * @author smiranda
 *
 * Esta classe representa uma abstração de um tipo de desconto, cujo atributo proximo guardará 
 * 
 * quem é o próximo desconto, recebido no construtor.
 * 
 * O método calcular é abstrato para que toda classe filha implemente o comportamento adequado
 * 
 * de cada tipo de desconto
 */
public abstract class Desconto {

	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	abstract BigDecimal calcular(Orcamento orcamento);
}
