package exercícios3;

import java.util.Scanner;

public class Exercício21 {

	public static void main(String[] args) {
		boolean ctz = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de turmas: ");
		int turmas = scan.nextInt();
		int alunos;
		int soma = 0;
		int media;
		
		
		for(int i = 0 ; i < turmas; i++) {
			
			ctz = true;
			
			do{
				System.out.println("Insira o número de alunos da turma" + (i + 1) );
				alunos = scan.nextInt();
			
			if(alunos <= 40) {
				ctz = false;
				
				
			} else {
				System.out.println("O número de alunos não pode ser maior que 40.");			
			}
			
		
		
		}while (ctz);
			
			soma += alunos;
	}
		media = soma / turmas;
		
		System.out.println("Média de alunos por turma: " + media);
		
		scan.close();

	}

}
