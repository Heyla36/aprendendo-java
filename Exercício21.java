package exerc�cios3;

import java.util.Scanner;

public class Exerc�cio21 {

	public static void main(String[] args) {
		boolean ctz = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero de turmas: ");
		int turmas = scan.nextInt();
		int alunos;
		int soma = 0;
		int media;
		
		
		for(int i = 0 ; i < turmas; i++) {
			
			ctz = true;
			
			do{
				System.out.println("Insira o n�mero de alunos da turma" + (i + 1) );
				alunos = scan.nextInt();
			
			if(alunos <= 40) {
				ctz = false;
				
				
			} else {
				System.out.println("O n�mero de alunos n�o pode ser maior que 40.");			
			}
			
		
		
		}while (ctz);
			
			soma += alunos;
	}
		media = soma / turmas;
		
		System.out.println("M�dia de alunos por turma: " + media);
		
		scan.close();

	}

}
