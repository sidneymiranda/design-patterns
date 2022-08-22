package estruturais.facade;

import java.math.BigDecimal;

import estruturais.composite.orcamento.ItemOrcamento;
import estruturais.composite.orcamento.Orcamento;

public class App {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);
		
		System.out.println(novo.getValor());
	}

}
