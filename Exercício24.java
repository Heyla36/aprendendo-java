package exerc�cio4;

import java.util.Scanner;

public class Exerc�cio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];
		
		for(int i = 0 ; i < A.length ; i++) {
			System.out.println("Entre com o n�mero da posi��o: " + i );
			A[i] = scan.nextInt();  
		}
		boolean palindromo = true;
		
		for(int i = 0 ; i < (A.length / 2) ; i++) {
			if (A[i] != A[A.length - 1 - i]) {
				palindromo = false;
				break;
			}	
			
		}
		System.out.println("Array A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
		if(palindromo) {
			System.out.println("Palindromo");
		}else {
			System.out.println("N�o � palindromo");
		}
		
		scan.close();
	}

}
