package estruturais.proxy.orcamento.situacao;

import estruturais.proxy.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
