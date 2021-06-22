package exercício4;

import java.util.Scanner;

public class Exercício30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[20];
		int[] B = new int[A.length];
		int[] C = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição A" + i);
			A[i] = scan.nextInt();
			
		}
		
		int posB = 0;
		int posC = 0;
		
		for(int i = 0; i < A.length; i++) {
		
			if(A[i] % 2 != 0) {
				B[posB] = A[i];
				posB++;
				
			}else {
				C[posC] = A[i];
				posC++;
			}
			
		}
		
		System.out.println("Vetor A =");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Vetor B =");
		for(int i = 0; i < posB; i++) { //utilizando posB porque ele guarda o número de vezes repetidas(metade nesse caso) para este problema 
			System.out.print(B[i] + " ");// Na hora do print só irá mostrar os valores de B maior que zero
		}
		
		System.out.println();
		
		System.out.println("Vetor C =");
		for(int i = 0; i < posC; i++) {
			System.out.print(C[i] + " ");
		}
		
		scan.close();
	}

}
