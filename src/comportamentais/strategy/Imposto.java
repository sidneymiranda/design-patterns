package strategy;

import java.math.BigDecimal;

public interface Imposto {

	public BigDecimal calcular(Orcamento orcamento);
}
