package exercícios3;

import java.util.Scanner;

public class Exercício24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Panificadora Pão de Ontem: ");
		System.out.println("Preço do pão: ");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "- R$" + (0.18 * i) );
			
			
		}
		
		
		
		
		
		scan.close();

	}

}
