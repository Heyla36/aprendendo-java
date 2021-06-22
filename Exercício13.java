package exercício4;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[4];
		
		for(int i = 0; i < A.length ; i++) {
			System.out.println("Entre com o valor da posição " + i + ":");
			A[i] = scan.nextInt();
			
		}
		
		int soma = 0;
		
		for(int i = 0; i < A.length ; i++) {
			
			if(A[i] % 5 == 0){
			soma += A[i];
			
			}
			
		}
		System.out.print("A = ");
		for(int i = 0; i < A.length ; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		System.out.println("Soma: " + soma);
		scan.close();

	}

}
