package exerc�cios;

import java.util.Scanner;

public class Exerc�cio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o quanto ganha por hora: ");
	
	double valorHora = scan.nextDouble();
	
		System.out.println("Digite as horas trabalhadas: ");
	
	double horas = scan.nextDouble();
	
	double sal�rioBruto = valorHora * horas;
	
		System.out.println("O sal�rio recebido �: " + sal�rioBruto);
		
	double inss = (sal�rioBruto / 100) * 8;
	double ir = (sal�rioBruto / 100) * 11;
	double sindicato = (sal�rioBruto / 100) * 5;
	
	double liquido = sal�rioBruto - sindicato - inss - ir;
	
		System.out.println("INSS: " + inss);
		
		System.out.println("Sindicato: " + sindicato);
		
		System.out.println("Imposto de Renda: " + ir);
		
		System.out.println("Sal�rio l�quido: " + liquido);
	
	

	}

}
