package exerc�cios3;

import java.util.Scanner;

public class TesteDeFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o sal�rio: ");
		double num2 = scan.nextDouble();
		
		for(int i = 2; i < 3; i++ ) {
			System.out.println("O sal�rio dividido por 2: " + (num2 / i));
			
		}
		
		scan.close();
	}

}
