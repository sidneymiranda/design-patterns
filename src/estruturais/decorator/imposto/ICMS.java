package estruturais.decorator.imposto;

import java.math.BigDecimal;

import estruturais.decorator.orcamento.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto proximoImposto) {
		super(proximoImposto);
	}

	@Override
	protected BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
