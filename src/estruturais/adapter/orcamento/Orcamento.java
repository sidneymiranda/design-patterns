package estruturais.adapter.orcamento;

import java.math.BigDecimal;

import estruturais.adapter.orcamento.situacao.EmAnalise;
import estruturais.adapter.orcamento.situacao.Finalizado;
import estruturais.adapter.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private int quantidadeItens;
	private BigDecimal valor;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}

	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public boolean isFinalizado() {
		return this.situacao instanceof Finalizado;
	}
	

}
