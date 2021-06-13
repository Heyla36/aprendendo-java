package exercícios3;

import java.util.Scanner;

public class Exercício25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		boolean sair = false;
		String sn;
		int qtd;
		double preco;
		double total;
		String output;
		double valorPago, troco;
		
		
		do {
			System.out.println("Deseja informar uma nova compra? S/N");
			sn = scan.next();
			
			if(sn.equalsIgnoreCase("S")) {
				
				output = "Lojas Tabajara\n";
				System.out.println(output);
				
				System.out.println("Entre com a quantidade de produtos: ");
				qtd = scan.nextInt();
				
				total = 0;
				
				for (int i = 1; i <= qtd; i++ ) {
					System.out.println("Informe o preço dos produtos: ");
					preco = scan.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$" + preco + "\n"; 
				}
				
				output += "TOTAL: R$" + total + "\n";
				System.out.println("TOTAL: R$" + total);
				
				System.out.println("Entre com o valor pago: ");
				valorPago = scan.nextDouble();
				
				output += "Dinheiro: R$" + valorPago + "\n";
				
				troco = valorPago - total;
				
				output += "Troco: R$" + troco;
				System.out.println(output);
				
			}else {
				sair = true;
			}
			
			
		}while(!sair);

	}

}
