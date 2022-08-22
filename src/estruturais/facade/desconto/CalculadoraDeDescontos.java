package estruturais.facade.desconto;

import java.math.BigDecimal;

import estruturais.composite.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));
	
		return cadeiaDeDescontos.calcular(orcamento);
	}
}
