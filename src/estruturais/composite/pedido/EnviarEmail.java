package estruturais.composite.pedido;

public class EnviarEmail implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Email enviado com sucesso!");
	}

}
