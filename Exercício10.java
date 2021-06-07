package exercícios;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		
		int num2 = scan.nextInt();
		
		System.out.println("Digite o número real: ");
		
		double num3 = scan.nextDouble();
	
		//Sempre separar as contas da informação acima
		int resultado1 = (num1 * 2) * (num2 / 2);
		
		double resultado2 = (num1 * 3) + num3;
		
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("O produto do dobro do primeiro elevado ao segundo é:");
		
		System.out.println("A soma do triplo do primeiro com o terceiro é: ");
		
		System.out.println("O terceiro elevado ao cubo é: ");

	}

}
