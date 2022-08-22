package estruturais.adapter.imposto;

import java.math.BigDecimal;

import estruturais.adapter.orcamento.Orcamento;

public interface Imposto {

	public BigDecimal calcular(Orcamento orcamento);
}
