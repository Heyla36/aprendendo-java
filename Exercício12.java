package exerc�cios3;

import java.util.Scanner;

public class Exerc�cio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Entre com um n�mero inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Tabuada de " + num1);
		
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(num1 + " x " + i + " = " + (num1 * i));
			
		}
		
		scan.close();

	}

}
