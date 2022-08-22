package chainOfResponsability;

import java.math.BigDecimal;

public class Orcamento {

	private int quantidadeItens;
	private BigDecimal valor;

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	

}
