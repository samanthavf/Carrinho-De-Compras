package CarrinhodeCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CarrinhodeCompras.Contas.Contas;
import CarrinhodeCompras.Produtos.Produtos;


public class Operacoes extends Contas {
	static Scanner sc = new Scanner(System.in);
	static List<Produtos> listProdutos = new ArrayList<Produtos>();
	static Contas c = new Contas();

	public String sistema() {
		System.out.println("    BEM VINDO AO NOSSO SISTEMA!    ");
		System.out.println(" APERTE A TECLA 'A' PARA INICIÁ-LO ");
		String bemvindo = sc.next();
		if (bemvindo.equalsIgnoreCase("A")) {
			voltar();
		}else {
		System.out.println("   OPS ALGO DEU ERRADO (❁´◡`❁)   \n");
		}return sistema();
	}
	
	private static void operacoes() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("------------------------CARRINHO DE COMPRAS-----------------------");
		System.out.println("SEUS PRODUTOS TEM 15% DE DESCONTO EM COMPRAS A PARTIR DE R$ 100,00");
		System.out.println("------------------------------------------------------------------");
		System.out.println("| OPERAÇÃO 1 - ADICIONAR AO CARRINHO|");
		System.out.println("| OPERAÇÃO 2 - VER TOTAL DO CARRINHO|");
		System.out.println("| OPERAÇÃO 3 - LIMPAR CARRINHO      |");
		
		int operacao = sc.nextInt();
		
		switch (operacao) {
		case 1:
			adicionar();
			break;
		case 2 :
			totalCarrinho();
			break;
		case 3 :
			limpar();
			break;
		default:
			System.out.printf("OPÇÃO INVÁLIDA😢");
			voltar();
			break;
		}
	}
	
	private static void adicionar() {
			System.out.println("----QUAL PRODUTO DESEJA ADICIONAR ?----");
			System.out.println("| PRODUTO 1 - CAMISA                  |");
			System.out.println("| PRODUTO 2 - CHAPÉU                  |");
			System.out.println("| PRODUTO 3 - SAPATO                  |");
			System.out.println("| PRODUTO 4 - SHORTS                  |");
				   	
   		Produtos produto = new Produtos();
     	int adiciona = sc.nextInt();
    		switch(adiciona) {
    		       case 1 :
    		    	   produto.Camisa();
    					break;
    				case 2:
    					produto.Chapeu();
    					break;
    				case 3:
    					produto.Sapato();
    					break;
    				case 4: 
    					produto.Shorts();
    					break;
    					
    					default:
    					System.out.println(" OPS HOUVE ALGUM ERRO");
    					voltar();
    					break;		    	
    		}
    listProdutos.add(produto);
 	voltar();
} 

	private static void totalCarrinho() {
	  if(listProdutos != null) {
			for (Produtos p : listProdutos) {
				System.out.println("PRODUTO : " + p);
				System.out.println("-------------------------------------------");
	       }
				System.out.printf( "TOTAL CARRINHO : R$ %.2f", c.TOTAL());
				System.out.println("\n-------------------------------------------");
				System.out.println("TOTAL DE PRODUTOS ADICIONADOS : " + listProdutos.size());
				System.out.println("\n-------------------------------------------");
				voltar();
			}else {
				setValorTotal(0);
			}		
	}

	private static void limpar() {
		if(listProdutos != null) {
			listProdutos.clear();
			System.out.println("CARRINHO FOI ESVAZIADO");
			System.out.println("-------------------------------------------");
			setValorTotal(0);
			voltar();
		}
	}

	private static void voltar() {
		operacoes();
	}

}

	
	
