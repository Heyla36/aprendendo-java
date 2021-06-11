package exercícios2;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário do colaborador: ");
		double salário = scan.nextDouble();
		
		int percentual = 0;
		
		if(salário <= 280) {
			percentual = 20;	
			
		} else if (salário > 280 && salário <= 700) {
			percentual = 15;
		
		} else if (salário > 700 && salário <= 1500) {
			percentual = 10;
			
		} else if (salário > 1500) {
			percentual = 5;
		}

		double resultado = (salário / 100) * percentual;
		double salarioAjustado = salário + resultado;
		
		System.out.println("O salário antes do reajuste: " + salário);
		System.out.println("Percentual aplicado: " + percentual);
		System.out.println("Aumento: " + resultado);
		System.out.println("O salário depois do reajuste: " + salarioAjustado);
	}

}
