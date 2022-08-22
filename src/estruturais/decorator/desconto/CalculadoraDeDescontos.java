package estruturais.decorator.desconto;

import java.math.BigDecimal;

import estruturais.adapter.desconto.Desconto;
import estruturais.adapter.desconto.DescontoParaOrcamentoComMaisDeCincoItens;
import estruturais.adapter.desconto.DescontoParaOrcamentoComValorMaiorQueQuinhentos;
import estruturais.adapter.desconto.SemDesconto;
import estruturais.adapter.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));
	
		return cadeiaDeDescontos.calcular(orcamento);
	}
}
