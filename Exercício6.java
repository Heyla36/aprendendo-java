package exerc�cios2;

import java.util.Scanner;

public class Exerc�cio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O " + num1 + " � o mais alto");
		
		} else if (num2 >= num1 && num2 >= num3 ) {
			System.out.println("O " + num2 + " � o mais alto");
		
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("O " + num3 + " � o mais alto");
		
		
		}
	}

}
