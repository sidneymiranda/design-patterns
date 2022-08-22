package chainOfResponsability;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	@Override
	BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
