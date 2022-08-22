package estruturais.facade.desconto;

import java.math.BigDecimal;

import estruturais.composite.orcamento.Orcamento;

/**
 * 
 * @author smiranda
 *
 *         Esta classe representa uma abstra��o de um tipo de desconto, cujo
 *         
 *         atributo proximo guardar�  quem � o pr�ximo desconto, recebido no construtor.
 * 
 *         O m�todo calcular � abstrato para que toda classe filha implemente o
 *         
 *         comportamento adequado de cada tipo de desconto
 */
public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public final BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}

	abstract BigDecimal efetuarCalculo(Orcamento orcamento);

	abstract boolean deveAplicar(Orcamento orcamento);
}
