package estruturais.composite.imposto;

import java.math.BigDecimal;

import estruturais.composite.orcamento.Orcamento;

public abstract class Imposto {

	private Imposto proximoImposto;

	public Imposto(Imposto proximoImposto) {
		this.proximoImposto = proximoImposto;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculo(orcamento);

		BigDecimal valorProximoImposto = BigDecimal.ZERO;

		if (proximoImposto != null) {
			valorProximoImposto = proximoImposto.realizarCalculo(orcamento);
		}

		return valorImposto.add(valorProximoImposto);
	}
}
