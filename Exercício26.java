package exercício4;

import java.util.Scanner;

public class Exercício26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] A = new int [4];
		int[] B = new int [A.length];
		int[] C = new int [A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com um número na posição A " + i);
			A[i] = scan.nextInt();
			
			System.out.println("Entre com um número na posicão B " + i);
			B[i] = scan.nextInt();
		}
		
		for(int i = 0; i < A.length; i++) {
			
			if(A[i] > B[i]) {
				C[i]++;
			
			}else if(A[i] == B[i] ) {
				C[i] = 0;
				
			}else {
				C[i] = -1;
				
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
		
		System.out.println();
		
		System.out.println("Vetor C = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(C[i] + " ");
		}
		scan.close();

	}

}
