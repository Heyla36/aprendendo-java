package exerc�cio4;

import java.util.Scanner;

public class Exerc�cio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];
		int[] B = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Entre com o n�mero da posi��o " + i);
			A[i] = scan.nextInt();
			//Dava pra ter utilizado operador tern�rio
			
			//B[i] = (A[i] % 2 == 0) ? 1 : 0;	<- MELHOR E MAIS F�CIL POR�M N�O T�O F�CIL PARA LEITURA
		}
		

		System.out.println("A = ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("B = ");
		for(int i = 0; i < A.length; i++) {
			
			if(A[i] % 2 == 0){			// M�TODO F�CIL PARA LEITURA
				B[i]++;
			
			}else if(A[i] % 2 != 0){
				B[i] += 0;
			}
			System.out.print(B[i] + " ");
			
		}
		
		scan.close();
	}

}
