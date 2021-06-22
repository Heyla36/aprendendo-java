package exercício4;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[11];
		int[] B = new int[A.length];
		
		
		for(int i = 1; i < A.length; i++) {
			System.out.println("Entre com o valor da posição * " + i) ;
			A[i] = scan.nextInt();
			
			B[i] = A[i] * i;
		}
		
		System.out.println("Valor: ");
		
		for(int i = 0; i < A.length; i++) {
			System.out.print(B[i] + " ");
		}
		
		scan.close();

	}

}
