package exercício4;

import java.util.Scanner;

public class Exercício36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] A = new double[11];
		
		for(int i = 0; i < A.length; i++) {
			
			A[i] = Math.pow(2, i);
		}
		
		System.out.println("Vetor A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		scan.close();
	}

}
