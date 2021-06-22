package exercício4;

import java.util.Scanner;

public class Exercícios23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int qtdPares = 0; 
		
		System.out.println("Entre com um números pares: ");
		for(int i = 0 ; i < A.length ; i++) {
			A[i] = scan.nextInt();
			
			if(A[i] % 2 == 0){
				qtdPares++;
				
			} else {
				System.out.println("Há número não par, o programa será encerrado.");
				break;
			}
		}
		
		System.out.println("Quantidade de pares fornecidos: " + qtdPares);
		scan.close();
	}

}
