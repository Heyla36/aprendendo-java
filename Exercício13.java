package exerc�cios3;

import java.util.Scanner;

public class Exerc�cio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a base: ");
		double base = scan.nextDouble();
		
		System.out.println("Entre com a pot�ncia: ");
		double pot = scan.nextDouble();
		
		double resultado = base;
		
		for (int i = 1; i < pot ; i++) {
			resultado *= base; 
		}
		System.out.println(resultado);
		scan.close();
	}

}
