package exercícios2;

import java.util.Scanner;

public class Exercício14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = scan.nextDouble();
		
		double resultado = (nota1 + nota2) / 2;
		
		
		String aproveitamento = "";
		if (resultado >= 9.0 && resultado <= 10.0) {
			aproveitamento = "A";
			System.out.println("Aprovado!");
			
		}else if (resultado <= 8.9 && resultado >= 7.5) {
			aproveitamento = "B";
			System.out.println("Aprovado!");
		
		}else if (resultado <= 7.4 && resultado >= 6.0) {
			aproveitamento = "C";
			System.out.println("Aprovado!");
		
		}else if (resultado <= 5.9 && resultado >= 4.0) {
			aproveitamento = "D";
			System.out.println("Reprovado.");
			
		}else if (resultado <= 3.9 && resultado >= 0) {
			aproveitamento = "E";
			System.out.println("Reprovado."); 
		
		}else {
			System.out.println("Numeração inválida.");
		
		}
		
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + resultado);
		System.out.println("Conceito: " + aproveitamento);
		  

	}

}
