package exerc�cio4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[5];
		double[] B = new double[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posi��o: " + i);
			A[i] = scan.nextInt();
			
			B[i] = Math.sqrt(A[i]);
		}
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.println("Os valores ao quadrado de A �: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(df.format(B[i]) + " ");
		} 
		
		scan.close();

	}

}
