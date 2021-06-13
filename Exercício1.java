package exercícios3;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			
		System.out.println("Digite a nota entre 1 a 10: ");
		double nota = scan.nextDouble();
		
		
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("A nota do aluno foi: " + nota);
			} else {
				System.out.println("Nota inválida digite novamente.");
			}
		
	} while(!notaValida ); // ! da pra usar em vez de ==false
		
		scan.close();
	} 
}
