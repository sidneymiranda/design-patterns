package estruturais.decorator.orcamento.situacao;

import estruturais.decorator.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
