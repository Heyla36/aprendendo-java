package exerc�cio4;

import java.util.Scanner;

public class Exerc�cio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];
		
		for(int i = 0 ; i < idades.length ; i++ ) {
			System.out.println("Insira a " + i +"� idade: ");
			idades[i] = scan.nextInt();
		}
		
		int menor = idades[0];
		int indexMenor = 0;
		int maior = idades[0];
		int indexMaior = 0;
		for(int i = 1 ; i < idades.length ; i++ ) {
			if(idades[i] > maior) {
				maior = idades[i];
				indexMaior = i;
				
			} else if(idades[i] < maior) {
				menor = idades [i];
				indexMenor = i;
			}
		}
		
		System.out.print("Vetor de idade = ");
		for(int i = 0; i < idades.length ; i++ ) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
 		System.out.println("Menor Idade: " + menor);
 		System.out.println("�ndice menores de Idade: " + indexMenor);

 		System.out.println("Maior Idade: " + maior);
 		System.out.println("�ndice maiores de Idade: " + indexMaior);

		
		scan.close();
	}

}
