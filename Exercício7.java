package exerc�cios2;

import java.util.Scanner;

public class Exerc�cio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o pre�o do primeiro produto: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o pre�o do segundo produto: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o pre�o do terceiro produto: ");
		int num3 = scan.nextInt();
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("O " + num1 + " � o mais barato");
		
		} else if (num2 <= num1 && num2 <= num3 ) {
			System.out.println("O " + num2 + " � o mais barato");
		
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("O " + num3 + " � o mais barato");
		
		} 

	}

}
