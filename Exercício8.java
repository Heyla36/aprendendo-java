package exerc�cio4;

import java.util.Scanner;

public class Exerc�cio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[2];
		int[] B = new int[A.length];
		int[] C = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor de A " + i);
			A[i] = scan.nextInt();
		}
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor de B: " + i);
			B[i] = scan.nextInt();
		}
		
		System.out.print("Subtra��o de C: ");
		for(int i = 0; i < A.length; i++) {
			C[i] = A[i] * B[i];
			System.out.print(C[i] + " ");
		}
		
		scan.close();

	}

}
