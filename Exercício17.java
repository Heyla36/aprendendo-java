package exerc�cio4;

import java.util.Scanner;

public class Exerc�cio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];
		
		for(int i = 0 ; i < A.length ; i++ ) {
			System.out.println("Insira a " + i +"� idade: ");
			A[i] = scan.nextInt();
		}
		
		int qtd35mais = 0;
		
		for(int i = 0 ; i < A.length ; i++ ) {
			if(A[i] > 35) {
				qtd35mais++;
			}
		}
		System.out.print("Vetor de idade = ");
		for(int i = 0 ; i < A.length ; i++ ) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
 		System.out.println("N�mero de pessoas maiores de 35: " + qtd35mais);
		scan.close();
	}

}
