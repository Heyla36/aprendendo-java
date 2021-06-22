package exercício4;

import java.util.Scanner;

public class Exercício35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição A - " + i);
			A[i] = scan.nextInt();
		}
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.println("Analizando o número " + A[i]);
			
			for(int j = 1; j < A[i]; j++) {
				if(A[i] % j == 0) {
					System.out.println(j + " é divisor");
				}
			}
			System.out.println();
		}	

	}

}
