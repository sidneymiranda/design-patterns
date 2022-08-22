package observer;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {

		String cliente = "Sidney";
		BigDecimal valorOrcamento = new BigDecimal("700");
		int quantidadeItens = 4;
		
		GeraPedido gerador = new GeraPedido(valorOrcamento, quantidadeItens, cliente);
		
//		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmail()));
		GeraPedidoHandler handler = new GeraPedidoHandler(new SalvarPedidoNoBancoDeDados(), new EnviarEmail());
		
		handler.execute(gerador);
	}

}
