package estruturais.facade.orcamento.situacao;

import estruturais.facade.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
