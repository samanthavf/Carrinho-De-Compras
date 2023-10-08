package CarrinhodeComprasTeste;

import java.util.Locale;

import CarrinhodeCompras.Operacoes;

public class Teste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Operacoes operacoes = new Operacoes();
		System.out.println(operacoes.sistema());
	}
}
