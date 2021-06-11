package exercícios2;

import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o método de operação ( + - * / )");
		int resultado = 0;
		String operacao = scan.next();
		
		if (operacao.equals("+")) {
			resultado = num1 + num2;
			System.out.println("O resultado é: " + resultado);
			
		} else if (operacao.equals("-")) {
			resultado = num1 - num2;
			System.out.println("O resultado é: " + resultado);
			
		} else if (operacao.equals("*")) {
			resultado = num1 * num2;
			System.out.println("O resultado é: " + resultado);
		
		} else if (operacao.equals("/")) {
			resultado = num1 / num2;
			System.out.println("O resultado é: " + resultado);
		
		} else {
			System.out.println("Operação inválida.");
		}
	}

}
