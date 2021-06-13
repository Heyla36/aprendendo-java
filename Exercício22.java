package exercícios3;

import java.util.Scanner;

public class Exercício22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de CD's: ");
		int qtd = scan.nextInt();
		double valor;
		double soma = 0;
		double media;
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Insira o valor do " + (i + 1) + "ª CD: ");
			valor = scan.nextDouble();
			
			soma += valor;
		}
		
		media = soma / qtd;
		
		System.out.println("MEDIA = " + media);
		scan.close();
	}

}
