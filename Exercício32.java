package exercício4;

import java.util.Scanner;

public class Exercício32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[5];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição A - " + i);
			A[i] = scan.nextInt();
		}
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Tabuada de " + A[i]);
	
			
			for(int j = 1; j <= 10; j++) {
				System.out.println(j + " * " + A[i] + " = " + (A[i] * j) );
			}
			
			System.out.println();
			
		}
		
		scan.close();
	}

}
