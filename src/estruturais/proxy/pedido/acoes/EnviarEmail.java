package estruturais.proxy.pedido.acoes;

import estruturais.proxy.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Email enviado com sucesso!");
	}

}
