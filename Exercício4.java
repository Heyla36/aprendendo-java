package exercício4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[5];
		double[] B = new double[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			A[i] = scan.nextInt();
			
			B[i] = Math.sqrt(A[i]);
		}
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.println("Os valores ao quadrado de A é: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(df.format(B[i]) + " ");
		} 
		
		scan.close();

	}

}
