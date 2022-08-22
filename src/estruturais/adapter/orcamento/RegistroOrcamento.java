package estruturais.adapter.orcamento;

import java.io.IOException;
import java.util.Map;

import estruturais.adapter.http.HttpAdapter;
import exception.DomainException;

public class RegistroOrcamento {

	private HttpAdapter http;

	public RegistroOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) throws IOException {
		// chamada HTTP para API externa: URL Connection, Http Client...

		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento não finalizado.");
		}
		String url = "";
		Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidade", orcamento.getQuantidadeItens());

		http.post(url, dados);
	}

}
