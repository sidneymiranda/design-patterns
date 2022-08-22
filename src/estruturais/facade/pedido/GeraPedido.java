package estruturais.facade.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	private String cliente;

	public GeraPedido(BigDecimal valorOrcamento, int quantidadeItens, String cliente) {
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
		this.cliente = cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public String getCliente() {
		return cliente;
	}

}
