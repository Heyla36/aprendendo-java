package exerc�cio4;

import java.util.Scanner;

public class Exerc�cio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] A = new double[20];
		System.out.println("Digite o valor do d�lar: ");
		double dolar = scan.nextDouble();
		
		for (int i = 0 ; i < A.length ; i++) {
				A[i] = dolar * (i + 1); // (i+1) j� resolve o problema de contagem, agora ir� at� 20 por ter adicionado 1 :D
			}
		
		System.out.print("Valor do d�lar em reais: ");
		for (int i = 0; i < A.length ; i++) {
			System.out.println(A[i] + " ");
		}
		
		scan.close();
	}

}
