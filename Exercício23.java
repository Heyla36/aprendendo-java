package exercícios2;

import java.util.Scanner;

public class Exercício23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Entre com o tipo de carne: ");
		System.out.println("1 - filé duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");
		int tipo = scan.nextInt();
		
		System.out.println("Entre com a quantidade de (kg): ");
		double kgCarne = scan.nextDouble();
		
		double precoKg = 0;
		
		if (tipo == 1) {
			
			System.out.println(kgCarne + "kg - filé duplo");
			
			if (kgCarne < 5) {
				precoKg = 4.9;
			
			} else {
			precoKg = 5.8;
			}
		
		}else if (tipo == 2) {
			
			System.out.println(kgCarne + "kg - alcatra");
			
			if (kgCarne < 5) {
				precoKg = 5.9;
			
			} else {
			precoKg = 6.8;
			}
		
		}else if (tipo == 3) {
			
			System.out.println(kgCarne + "kg - picanha");
			
			if (kgCarne < 5) {
				precoKg = 6.9;
			
			} else {
			precoKg = 7.8;
			}
		}
		
		double total = kgCarne * precoKg;
		System.out.println("Total: " + total);
		
		System.out.println("O pagamento foi feito no cartão? Digite 1 para sim.");
		int cartao = scan.nextInt();
		if(cartao == 1) {
			double desconto = (total/100) * 5;
			System.out.println("O desconto foi de: " + total);
			
		} else {
			System.out.println("Sem desconto.");
		}
		
		double valorFinal = total;
		System.out.println("Valor a pagar: " + valorFinal);
	}

}
