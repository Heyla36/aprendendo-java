package exercícios3;

import java.util.Scanner;

public class Exercício31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean valido = true;
		int codigo;
		int qtd;
		double total = 0;
		String output = "";
		double preco;
		
		do {
			System.out.println("Insira o código e a quantidade do pedido: ");
			codigo = scan.nextInt();
			qtd = scan.nextInt();
			
			if(codigo == 0 && qtd == 0) {
				valido = false;
				output += "Total a pagar = " + total;
			}else{
				if(codigo == 100) {
					output += "Cachorro quente -> 1,20 * " + qtd;
					output += " = " + (1.20 * qtd) + "\n";  
					total += 1.20 * qtd;
				}else if (codigo == 101) {
					output += "Bauru simples -> 1,30 * " + qtd;
					output += " = " + (1.30 * qtd) + "\n";
					total += 1.30 * qtd;
				}else if(codigo == 102 ) {
					output += "Bauru com ovo -> 1,50 * " + qtd;
					output += " = " + (1.50 * qtd) + "\n";
					total += 1.50 * qtd;
				}else if(codigo == 103) {
					output += "Hambúrguer -> 1,20 * " + qtd;
					output += " = " + (1.20 * qtd) + "\n";
					total += 1.20 * qtd;
				}else if(codigo == 104) {
					output += "Cheeseburguer -> 1,30 * " + qtd;
					output += " = " + (1.30 * qtd) + "\n";
					total += 1.30 * qtd;
				}else if(codigo == 105) {
					output += "Refrigerante -> 1,00 * " + qtd;
					output += " = " + (1.00 * qtd) + "\n";
					total += 1.00 * qtd;
			}
			}
			
		}while(valido);
		
		System.out.println(output);
		
		scan.close();
	}

}
