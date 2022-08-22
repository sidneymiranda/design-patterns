package estruturais.composite.imposto;

import java.math.BigDecimal;

import estruturais.composite.orcamento.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto proximoImposto) {
		super(proximoImposto);
	}

	@Override
	protected BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
