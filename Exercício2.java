package exerc�cios2;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double num1 = scan.nextDouble();
		
		if (num1 < 0) {
			System.out.println(num1 + " � negativo.");
			
		} else {
			System.out.println(num1 + " � positivo.");
			
		}
		

	}

}
