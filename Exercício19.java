package exerc�cios2;

import java.util.Scanner;

public class Exerc�cio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o m�todo de opera��o ( + - * / )");
		int resultado = 0;
		String operacao = scan.next();
		
		if (operacao.equals("+")) {
			resultado = num1 + num2;
			System.out.println("O resultado �: " + resultado);
			
		} else if (operacao.equals("-")) {
			resultado = num1 - num2;
			System.out.println("O resultado �: " + resultado);
			
		} else if (operacao.equals("*")) {
			resultado = num1 * num2;
			System.out.println("O resultado �: " + resultado);
		
		} else if (operacao.equals("/")) {
			resultado = num1 / num2;
			System.out.println("O resultado �: " + resultado);
		
		} else {
			System.out.println("Opera��o inv�lida.");
		}
	}

}
