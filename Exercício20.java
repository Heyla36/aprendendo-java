package exercício4;

import java.util.Scanner;

public class Exercício20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] A = new double[20];
		System.out.println("Digite o valor do dólar: ");
		double dolar = scan.nextDouble();
		
		for (int i = 0 ; i < A.length ; i++) {
				A[i] = dolar * (i + 1); // (i+1) já resolve o problema de contagem, agora irá até 20 por ter adicionado 1 :D
			}
		
		System.out.print("Valor do dólar em reais: ");
		for (int i = 0; i < A.length ; i++) {
			System.out.println(A[i] + " ");
		}
		
		scan.close();
	}

}
