package exerc�cio4;

import java.util.Scanner;

public class Exerc�cio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		
		for(int i =0; i < A.length; i++) {
			System.out.println("Entre com o valor da posi��o " + i + ":");
			A[i] = scan.nextInt();
		
		}
		
		int impar = 0;
		for(int i = 0; i < A.length; i++) {
			
			if(A[i] % 2 != 0){
				impar++;
			}
			
		}
		
		int par = A.length - impar;
		int porcentPar = (par * 100) / A.length;
		int porcentImpar = 100 - porcentPar;
		
		System.out.print("A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Par %: " + porcentPar);
		System.out.println("Impar %: " + porcentImpar);
		scan.close();

	}

}
