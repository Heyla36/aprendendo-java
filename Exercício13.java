package exercícios;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o quanto ganha por hora: ");
	
	double valorHora = scan.nextDouble();
	
		System.out.println("Digite as horas trabalhadas: ");
	
	double horas = scan.nextDouble();
	
	double salárioBruto = valorHora * horas;
	
		System.out.println("O salário recebido é: " + salárioBruto);
		
	double inss = (salárioBruto / 100) * 8;
	double ir = (salárioBruto / 100) * 11;
	double sindicato = (salárioBruto / 100) * 5;
	
	double liquido = salárioBruto - sindicato - inss - ir;
	
		System.out.println("INSS: " + inss);
		
		System.out.println("Sindicato: " + sindicato);
		
		System.out.println("Imposto de Renda: " + ir);
		
		System.out.println("Salário líquido: " + liquido);
	
	

	}

}
