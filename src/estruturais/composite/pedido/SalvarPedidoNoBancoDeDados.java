package estruturais.composite.pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido salvo com sucesso!");
	}

}
