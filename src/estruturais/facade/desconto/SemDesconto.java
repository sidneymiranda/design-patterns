package estruturais.facade.desconto;

import java.math.BigDecimal;

import estruturais.composite.orcamento.Orcamento;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	@Override
	BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

}
