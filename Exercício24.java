package exerc�cios3;

import java.util.Scanner;

public class Exerc�cio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Panificadora P�o de Ontem: ");
		System.out.println("Pre�o do p�o: ");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "- R$" + (0.18 * i) );
			
			
		}
		
		
		
		
		
		scan.close();

	}

}
