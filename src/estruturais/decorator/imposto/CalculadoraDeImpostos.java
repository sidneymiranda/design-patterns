package estruturais.decorator.imposto;

import java.math.BigDecimal;

import estruturais.decorator.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
