package exercícios2;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num1 = scan.nextDouble();
		
		if (num1 < 0) {
			System.out.println(num1 + " é negativo.");
			
		} else {
			System.out.println(num1 + " é positivo.");
			
		}
		

	}

}
