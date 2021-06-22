package exercício4;

import java.util.Scanner;

public class Exercício27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[8];
		char[] B = new char[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com um número na posição " + i);
			A[i] = scan.nextInt();
		}
		
		System.out.print("Valores de A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Valores de B = ");
		for(int i = 0; i < A.length; i++) {
			if(A[i] < 7 ) {
				B[i] = 97;
				
			}else if(A[i] == 7) {
				B[i] = 98;
			
			}else if(A[i] > 7 && A[i] < 10 ) {
				B[i] = 99;
			
			}else if(A[i] == 10) {
				B[i] = 100;
			
			}else {
				B[i] = 101;
			}
			
			System.out.print(B[i] + " ");
		}
		
		scan.close();
	}

}
