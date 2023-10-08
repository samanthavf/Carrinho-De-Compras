package CarrinhodeCompras.Contas;

public class Contas{
	protected double valorProduto;
	protected static double valorTotal = 0;
	protected String produto;

	public double TOTAL() {
		return getValorTotal();
	}
	
	private double desconto() {
		double p = 15;
		double valor = 0;
		if(getValorProduto() > 100.00) {
		valor = (p/100)*getValorProduto();	
		}return valor;
	}	

	protected void adiciona() {
		System.out.println("PRODUTO ADICIONADO AO CARRINHO : " + getProduto());
		if(getValorProduto() > 100.00) {
			System.out.printf("DESCONTO DE : R$ %.2f\n" , desconto());
			setValorProduto(getValorProduto() - desconto());
		}else {
			System.out.println("NÃO POSSUI DESCONTO");
		}
		valorTotal+=getValorProduto();
	}

	protected double getValorProduto() {
		return valorProduto;
	}

	protected void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto ;
	}

	protected static void setValorTotal(double valorTotal) {
		Contas.valorTotal = valorTotal;
	}

	protected double getValorTotal() {
		return valorTotal;
	}

	protected String getProduto() {
		return produto;
	}

	protected void setProduto(String produto) {
		this.produto = produto;
	}
}
