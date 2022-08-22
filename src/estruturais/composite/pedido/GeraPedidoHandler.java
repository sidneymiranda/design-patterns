package estruturais.composite.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import estruturais.composite.orcamento.ItemOrcamento;
import estruturais.composite.orcamento.Orcamento;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes = new ArrayList<>();

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public GeraPedidoHandler(AcaoAposGerarPedido... acoes) {
		for (AcaoAposGerarPedido acao : acoes) {
			this.acoes.add(acao);
		}
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(acao -> acao.executarAcao(pedido));
	}

}
