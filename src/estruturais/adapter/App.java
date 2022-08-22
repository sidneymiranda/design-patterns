package estruturais.adapter;

import java.io.IOException;
import java.math.BigDecimal;

import estruturais.adapter.http.JavaHttpClient;
import estruturais.adapter.orcamento.Orcamento;
import estruturais.adapter.orcamento.RegistroOrcamento;

public class App {

	public static void main(String[] args) throws IOException {

		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}

}
