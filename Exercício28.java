package exerc�cio4;

import java.util.Scanner;

public class Exerc�cio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];
		int[] B = new int[A.length];

		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posi��o " + i);
			A[i] = scan.nextInt();
			
			B[A.length - i - 1] = A[i];
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
