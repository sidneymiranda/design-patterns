package estruturais.composite.imposto;

import java.math.BigDecimal;

import estruturais.composite.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
