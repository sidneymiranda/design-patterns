package templateMethod;

import java.math.BigDecimal;

/**
 * 
 * @author smiranda
 *
 *         Define-se uma classe abstrata que fornece maneiras predefinidas de executar seus métodos.
 *         As subclasses que herdam esses métodos também devem seguir o caminho definido na classe abstrata.
 * 		   Em alguns casos, a classe abstrata pode já incluir uma implementação de método, não apenas instruções, 
 * 		   se for uma funcionalidade que será compartilhada entre todas ou a maioria das subclasses.
 *         
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
