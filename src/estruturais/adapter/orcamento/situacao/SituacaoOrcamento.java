package estruturais.adapter.orcamento.situacao;

import java.math.BigDecimal;

import estruturais.adapter.orcamento.Orcamento;
import exception.DomainException;

/**
 * 
 * @author smiranda
 * 
 * O padrão state é recomendado em situações cujo objeto se comporte de formas diferentes, dependendo do seu estado.
 * Se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual.
 * 
 * Neste exeplo, o padrão foi aplicado nas possíveis situações de um orçamento, criando esta classe abstrata com métodos com comportamento
 * padrão, e em cada situação específica sobrescreve-se o(s) método(s) correspondente(s), implementando o comportamento adequado à situação
 * bem como os possíveis estados que este pode assumir.
 */

public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser finalizado!");
	}
	
}
