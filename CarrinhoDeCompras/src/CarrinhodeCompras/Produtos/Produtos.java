package CarrinhodeCompras.Produtos;

import java.util.Scanner;

import CarrinhodeCompras.Contas.Contas;

public class Produtos extends Contas{
	static Scanner sc = new Scanner(System.in);
    private double valorProduto;
	private String produto;
	static int counter = 0;
	
	@Override
 	public String toString() {
		return "PRODUTO : " + produto + "\nVALOR PRODUTO : " + getValorProduto() +  "\nID : " + getCounter();
	}
	
	public String Camisa() {
		setProduto("CAMISA");
		System.out.println("PRODUTO : " + produto);
		System.out.println("-------------------------------------------");
		System.out.println("DIGITE O VALOR DA CAMISA :");
		double valorcamisa = sc.nextDouble();
		setValorProduto(valorcamisa);
		adiciona();
		System.out.println("-------------------------------------------");
		System.out.printf("VALOR FINAL DO PRODUTO : R$ %.2f" , getValorProduto());
		return getProduto();
	}

	public String Chapeu() {
		setProduto("CHAPÉU");
		System.out.println("PRODUTO : " + produto);
		System.out.println("-------------------------------------------");
		System.out.println("DIGITE O VALOR DO CHAPÉU :");
		double valorchapeu = sc.nextDouble();
		setValorProduto(valorchapeu);
		adiciona();
		System.out.println("-------------------------------------------");
		System.out.printf("VALOR FINAL DO PRODUTO : R$ %.2f" , getValorProduto());
		return getProduto();
	}
	
	public String Sapato() {
		setProduto("SAPATO");
		System.out.println("PRODUTO : " + produto);
		System.out.println("-------------------------------------------");
		System.out.println("DIGITE O VALOR DO SAPATO :");
		double valorsapato = sc.nextDouble();
		setValorProduto(valorsapato);
		System.out.println("-------------------------------------------");
		adiciona();
		System.out.println("-------------------------------------------");
		System.out.printf("VALOR FINAL DO PRODUTO : R$ %.2f" , getValorProduto());
		return getProduto();

	}

	public String Shorts() {
		setProduto("SHORTS");
		System.out.println("PRODUTO : " + produto);
		System.out.println("-------------------------------------------");
		System.out.println("DIGITE O VALOR DO SHORTS : ");
		double valorshorts = sc.nextDouble();
		setValorProduto(valorshorts);
		System.out.println("-------------------------------------------");
		setValorProduto(valorshorts);
		adiciona();
		System.out.println("-------------------------------------------");
		System.out.printf("VALOR FINAL DO PRODUTO : R$ %.2f" , getValorProduto());
		return getProduto();
	}

	@Override
	public String getProduto() {
		return produto;
	}

	@Override
	public void setProduto(String produto) {
		this.produto = produto;
	}

	@Override
	public double getValorProduto() {
		return valorProduto;
	}

	@Override
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public static int getCounter() {
		return counter + 1;
	}

	public static void setCounter(int counter) {
		Produtos.counter = counter;
	}
	
}
