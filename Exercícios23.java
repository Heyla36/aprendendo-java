package exerc�cio4;

import java.util.Scanner;

public class Exerc�cios23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int qtdPares = 0; 
		
		System.out.println("Entre com um n�meros pares: ");
		for(int i = 0 ; i < A.length ; i++) {
			A[i] = scan.nextInt();
			
			if(A[i] % 2 == 0){
				qtdPares++;
				
			} else {
				System.out.println("H� n�mero n�o par, o programa ser� encerrado.");
				break;
			}
		}
		
		System.out.println("Quantidade de pares fornecidos: " + qtdPares);
		scan.close();
	}

}
