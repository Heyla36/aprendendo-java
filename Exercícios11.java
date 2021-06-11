package exercícios2;

import java.util.Scanner;

public class Exercícios11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor hora: ");
		double valorH = scan.nextDouble();
		
		System.out.println("Digite as horas trabalhadas: ");
		double horasTrabalho = scan.nextDouble();
		
		double salárioBruto = valorH * horasTrabalho;
		int percentualIr = 0;
		
		if (salárioBruto <= 900) {
			percentualIr = 0;
			System.out.println("Não há desconto, o colaborador é insento.");
			
		} else if (salárioBruto > 900 && salárioBruto <= 1500 ) {
			percentualIr = 5; 
				
		 } else if (salárioBruto > 1500 && salárioBruto <= 2500) {
			 percentualIr = 10;
			 
		 } else if (salárioBruto > 2500) {
			 percentualIr = 20;
		 }
		
		double ir = (salárioBruto / 100) * percentualIr;
		double inss = (salárioBruto / 100) * 10;
		double fgts = (salárioBruto/ 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salárioBruto - totalDescontos; 
		
		System.out.println("Total desconto IR: " + percentualIr);
		System.out.println("Total desconto INSS: " + inss);
		System.out.println("Total desconto FGTS: " + fgts);
		System.out.println("Salário líquido: " + salarioLiquido);
		System.out.println("Total de descontos: " + totalDescontos);
		
		
		
	}
		
}
