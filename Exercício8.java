package exerc�cios3;

import java.util.Scanner;

public class Exerc�cio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int soma = 0;
		int media; 
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Entre com um n�mero: ");
			num = scan.nextInt();
			
			soma += num;
		}
		
		media = soma/5;
		
		System.out.println("SOMA: " + soma);
		System.out.println("MEDIA: " + media);
		
		scan.close();

	}

}
