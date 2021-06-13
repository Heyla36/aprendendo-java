package exercícios3;

import java.util.Scanner;

public class Exercício23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de preços: ");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "- R$" + (1.99 * i) );
			
			
		}
		
		
		
		
		
		scan.close();

	}

}
