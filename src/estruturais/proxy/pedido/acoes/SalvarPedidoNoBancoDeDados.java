package estruturais.proxy.pedido.acoes;

import estruturais.proxy.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido salvo com sucesso!");
	}

}
