package exerc�cios2;

import java.util.Scanner;

public class Exerc�cio5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		
		double nota0 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		
		double nota1 = scan.nextDouble();
		double resultado = nota0 + nota1;
		
		if (resultado >= 7) {
			System.out.println("Aprovado, nota final: " + resultado);
		
		} else if (resultado == 10 ) {
			System.out.println("Aprovado com distin��o.");
			
		} else {
			System.out.println("Reprovado, nota final: " + resultado);
		}
		
	}
	
	}


