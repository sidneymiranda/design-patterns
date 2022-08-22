package estruturais.adapter.orcamento.situacao;

import java.math.BigDecimal;

import estruturais.adapter.orcamento.Orcamento;
import exception.DomainException;

/**
 * 
 * @author smiranda
 * 
 * O padr�o state � recomendado em situa��es cujo objeto se comporte de formas diferentes, dependendo do seu estado.
 * Se o resultado de uma chamada de m�todo depende do estado, podemos delegar esta a��o para uma classe espec�fica do estado atual.
 * 
 * Neste exeplo, o padr�o foi aplicado nas poss�veis situa��es de um or�amento, criando esta classe abstrata com m�todos com comportamento
 * padr�o, e em cada situa��o espec�fica sobrescreve-se o(s) m�todo(s) correspondente(s), implementando o comportamento adequado � situa��o
 * bem como os poss�veis estados que este pode assumir.
 */

public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Or�amento n�o pode ser finalizado!");
	}
	
}
