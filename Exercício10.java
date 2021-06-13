package exercícios3;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número int: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número int:");
		int num2 = scan.nextInt();
		
		for(int i = num1; i <= num2 ; i++) {
			System.out.println(i);
		}
		
		
		scan.close();

	}

}
