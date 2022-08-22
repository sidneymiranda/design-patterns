package estruturais.decorator;

import java.io.IOException;
import java.math.BigDecimal;

import estruturais.decorator.imposto.CalculadoraDeImpostos;
import estruturais.decorator.imposto.ICMS;
import estruturais.decorator.imposto.ISS;
import estruturais.decorator.orcamento.Orcamento;

public class App {

	public static void main(String[] args) throws IOException {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
		orcamento.aprovar();
		orcamento.finalizar();
		
	}

}
