package exerc�cios3;

import java.util.Scanner;

public class Exerc�cio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de pre�os: ");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "- R$" + (1.99 * i) );
			
			
		}
		
		
		
		
		
		scan.close();

	}

}
