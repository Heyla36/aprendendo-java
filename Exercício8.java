package exercícios;

import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Digite o quanto ganha por hora: ");
		
		double valorHora = scan.nextDouble();
		
			System.out.println("Digite as horas trabalhadas: ");
		
		double horas = scan.nextDouble();
		
		double salário = valorHora * horas;
			
			System.out.println("O salário recebido é: " + salário);
	}

}
