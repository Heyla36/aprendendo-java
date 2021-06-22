package exercício4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[2];
		double[] B = new double[A.length];
		double[] C = new double[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor de A: " + i);
			A[i] = scan.nextInt();
		}
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor de B: " + i);
			B[i] = scan.nextInt();
		}
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Divisão de C: ");
		for(int i = 0; i < A.length; i++) {
			C[i] = A[i] / B[i];
			System.out.print(df.format(C[i]) + " ");
			
		}
		
		scan.close();

	}

}
