package estruturais.adapter.imposto;

import java.math.BigDecimal;

import estruturais.adapter.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
