package exercício4;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[4];
		int[] B = new int[A.length];
		int[] C = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.println("Entre com o valor do vetor A: " + i);
			A[i] = scan.nextInt();
			
		}
		for(int i = 0; i < B.length; i++) {
			
			System.out.println("Entre com o valor do vetor B: " + i);
			B[i] = scan.nextInt();
			
		}
		System.out.print("Valor A: ");
		
		for(int i = 0; i < A.length; i++) {
			System.out.print(B[i] + " ");
		}
		
		System.out.println();// pulo de linha
		
		System.out.print("Valor B: ");
		
		for(int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		
		System.out.println();// pulo de linha
		
		System.out.print("Valor de C:");
		for(int i = 0; i < A.length; i++) {
			C[i] = A[i] + B[i];//CONTA
			System.out.print(C[i] + " ");
	
		}
		
		
		scan.close();
	}

}
