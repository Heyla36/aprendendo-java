package exerc�cio4;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[2];
		int[] B = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posi��o: " + i);
			A[i] = scan.nextInt();
			
			B[i] = A[i] * A[i];
		}
		
		System.out.println("Os valores ao quadrado de A �: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(B[i] + " ");
		}
		
		scan.close();
	}

}
