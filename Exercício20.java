package exerc�cios3;

import java.util.Scanner;

public class Exerc�cio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de idades: ");
		int idades = scan.nextInt();
		int idade;
		int media;
		int soma = 0;
		
		for( int i = 0 ; i < idades ; i++ ) {
			System.out.println("Entre com a idade da " + (i + 1) + "� pessoa:" );
			idade = scan.nextInt();
			
			soma += idade;
		}
		
		media = soma / idades;
		
		System.out.println("M�dia de idades: " + media);
		
		if (media >= 0 && media <=25) {
			System.out.println("A turma � composta de jovens com menos de 26 anos.");
		
		} else if (media >= 26 && media <= 60) {
			System.out.println("A turma � composta de adultos entre 26 e 60.");
			
		} else {
			System.out.println("A turma � composta de idosos.");
		}
		
		scan.close();

	}

}
