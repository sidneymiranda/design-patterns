package strategy;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		System.out.println(calculadora.calcular(orcamento, new ICMS()));

		System.out.println(calculadora.calcular(orcamento, new ISS()));
	}

}
