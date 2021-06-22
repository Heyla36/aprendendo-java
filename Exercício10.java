package exercício4;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		/*A [0] = 4;
		A [1] = 2;
		A [2] = 1;
		A [3] = 3;
		A [4] = 5;*/
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			A[i] = scan.nextInt();
			
			B[i] = A[i] % 2; 
		}
		
		System.out.println("Vetor A: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Vetor B: ");
		for(int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}	
		
		scan.close();
	}

}
