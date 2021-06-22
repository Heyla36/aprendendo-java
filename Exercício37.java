package exercício4;

import java.util.Scanner;

public class Exercício37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o número da posição A - " + i);
			A[i] = scan.nextInt();
		}
		
		for(int i = 0; i < A.length; i++) {
			
			B[i] = 1;
			
			for(int j = 1; j <= A[i]; j++) {
				B[i] *= j;
			}
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
		
		scan.close();
	}

}
