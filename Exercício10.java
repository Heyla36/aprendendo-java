package exerc�cios3;

import java.util.Scanner;

public class Exerc�cio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero int: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero int:");
		int num2 = scan.nextInt();
		
		for(int i = num1; i <= num2 ; i++) {
			System.out.println(i);
		}
		
		
		scan.close();

	}

}
