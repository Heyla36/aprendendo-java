package exercício4;

import java.util.Scanner;

public class Exercício22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		
		int qtd1 = 0, qtd = 0;
		
		for(int i = 0 ; i < A.length ; i++ ) {
			A[i] = (int)Math.round(Math.random() * 1) ;
			
			if(A[i] == 1){
				qtd1++;
				
			} else if(A[i] == 0){
				qtd++;
			}
		}
		
		double percentual = (qtd * 100 ) / A.length;
		double percentual1 = (qtd1 * 100 ) / A.length;
		
		System.out.println("Quantidade número 0: " + qtd);
		System.out.println("Quantidade número 1: " + qtd1);
		System.out.println("Percentual 0: " + percentual);
		System.out.println("Percentual 1: " + percentual1);
		scan.close();
	}

}
