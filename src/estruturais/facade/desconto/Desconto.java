package estruturais.facade.desconto;

import java.math.BigDecimal;

import estruturais.composite.orcamento.Orcamento;

/**
 * 
 * @author smiranda
 *
 *         Esta classe representa uma abstração de um tipo de desconto, cujo
 *         
 *         atributo proximo guardará  quem é o próximo desconto, recebido no construtor.
 * 
 *         O método calcular é abstrato para que toda classe filha implemente o
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
