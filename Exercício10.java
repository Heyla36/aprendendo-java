package exerc�cios2;

import java.util.Scanner;

public class Exerc�cio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio do colaborador: ");
		double sal�rio = scan.nextDouble();
		
		int percentual = 0;
		
		if(sal�rio <= 280) {
			percentual = 20;	
			
		} else if (sal�rio > 280 && sal�rio <= 700) {
			percentual = 15;
		
		} else if (sal�rio > 700 && sal�rio <= 1500) {
			percentual = 10;
			
		} else if (sal�rio > 1500) {
			percentual = 5;
		}

		double resultado = (sal�rio / 100) * percentual;
		double salarioAjustado = sal�rio + resultado;
		
		System.out.println("O sal�rio antes do reajuste: " + sal�rio);
		System.out.println("Percentual aplicado: " + percentual);
		System.out.println("Aumento: " + resultado);
		System.out.println("O sal�rio depois do reajuste: " + salarioAjustado);
	}

}
