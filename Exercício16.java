package exercício4;



import java.util.Scanner;

public class Exercício16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[5];
		
		for(int i =0; i < A.length; i++) {
			System.out.println("Entre com o valor da posição " + i + ":");
			A[i] = scan.nextInt();
		
		}
		
		double somaMenor15 = 0;
		double somaMaior15 = 0;
		int igual15 = 0;
		int qtdMaior = 0;
		
		for(int i =0; i < A.length; i++) {
			if(A[i] == 15) {
				igual15++;
			}
			else if (A[i] < 15) {
				somaMenor15 += A[i];
				
			} else {
				qtdMaior++;
				somaMaior15 += A[i];
				
			}
			
		}
		for(int i =0; i < A.length; i++) {
			System.out.print(A[i] + " " );
		}
		System.out.println();
		
		System.out.println("Número de 15 repetidos: " + igual15);
		System.out.println("Soma menores que 15: " + somaMenor15);
		System.out.println("Soma maiores que 15: " + somaMaior15);
		System.out.println("Media: " + (somaMaior15/qtdMaior) );
		
		scan.close();

	}

}
