package exerc�cios3;

import java.util.Scanner;

public class Exerc�cio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.print("Entre com um n�mero: ");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
				System.out.println("O maior n�mero foi mudado: " + maior);
			}
		}
		System.out.println("O maior n�mero digitado foi: " + maior);
	}

}
