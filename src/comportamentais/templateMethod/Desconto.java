package templateMethod;

import java.math.BigDecimal;

/**
 * 
 * @author smiranda
 *
 *         Define-se uma classe abstrata que fornece maneiras predefinidas de executar seus m�todos.
 *         As subclasses que herdam esses m�todos tamb�m devem seguir o caminho definido na classe abstrata.
 * 		   Em alguns casos, a classe abstrata pode j� incluir uma implementa��o de m�todo, n�o apenas instru��es, 
 * 		   se for uma funcionalidade que ser� compartilhada entre todas ou a maioria das subclasses.
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
