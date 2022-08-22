package chainOfResponsability;

import java.math.BigDecimal;


/**
 * 
 * @author smiranda
 *
 * Esta classe representa uma abstra��o de um tipo de desconto, cujo atributo proximo guardar� 
 * 
 * quem � o pr�ximo desconto, recebido no construtor.
 * 
 * O m�todo calcular � abstrato para que toda classe filha implemente o comportamento adequado
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
