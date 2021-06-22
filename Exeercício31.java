package exercício4;

import java.util.Scanner;

public class Exeercício31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição A" + i);
			A[i] = scan.nextInt();
		}
		
		int posB = 0; 
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] % 2 == 0){
				B[posB] = A[i];
				posB++;
			}
		}
		

		for(int i = 0; i < A.length; i++) {
			
			if(A[i] % 2 != 0){
				B[posB] = A[i];
				posB++;
			}
		}
		
		System.out.println("Vetor A =");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Vetor B =");
		for(int i = 0; i < posB; i++) {  
			System.out.print(B[i] + " ");
		}
		
		
		scan.close();
	}

}
