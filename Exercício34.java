package exerc�cio4;

import java.util.Scanner;

public class Exerc�cio34 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o valor da posi��o A - " + i);
			A[i] = scan.nextInt();
		}
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.println("Analizando o n�mero " + A[i]);
			
			for(int j = 2; j < A[i]; j++) {
				if(j % 2 == 0) {
					System.out.println(j + " � par");
				}
			}
			System.out.println();
		}
		
		scan.close();

	}

}
