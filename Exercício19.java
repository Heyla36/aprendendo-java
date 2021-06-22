package exercício4;

import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {
 		Scanner scan = new Scanner(System.in);
 		
 		double[] notas1 = new double[3];
 		double[] notas2 = new double[notas1.length];
 		double[] resultado = new double[notas1.length];
 		
 		for(int i = 0 ; i < notas1.length ; i++) {
 			System.out.println("Insira as notas do primeiro bimestre, Aluno " + i + ": ");
 			notas1[i] = scan.nextDouble();
 			
 			System.out.println("Insira as notas do segundo bimestre, Aluno" + i + ": ");
 			notas2[i] = scan.nextDouble();
 		
 			resultado[i] = ( notas1[i] + notas2[i] ) / 2 ;	
 			
 		}
 		System.out.println("Notas primeiro bimestre = ");
 		for(int i = 0 ; i < notas1.length ; i++) {
 			System.out.print(notas1[i] + " ");
 		
 		}
 		System.out.println();
 		
 		System.out.println("Notas segundo bimestre = ");
 		for(int i = 0 ; i < notas1.length ; i++) {
 			System.out.print(notas2[i] + " ");
 		
 		}
 		System.out.println();
 		System.out.println();
 		
 		System.out.println("RESULTADOS: ");
 		for(int i = 0 ; i < resultado.length ; i++) {
 			
 			if(resultado[i] > 7){
 				System.out.println("Aprovado: " + resultado[i]);
 				
 			} else {
 				System.out.println("Reprovado: " + resultado[i]);
 			}
 		
 		}
 		
 		
 		scan.close();
	}

}
