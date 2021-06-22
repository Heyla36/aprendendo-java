package exercício4;

import java.util.Scanner;

public class Exercício29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[5];
		int[] B = new int[A.length];
		int[] C = new int[A.length * 2];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o número da posição A" + i);
			A[i] = scan.nextInt();
			
			C[i] = A[i];
		}
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o número da posição B" + i);
			B[i] = scan.nextInt();
			
			C[A.length + i] = B[i];
		}
		
		System.out.println("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Vetor B = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(B[i] + " ");
		}

		System.out.println();
		
		System.out.println("Vetor C = ");
		for(int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
		scan.close();

	}

}
