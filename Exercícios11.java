package exerc�cios2;

import java.util.Scanner;

public class Exerc�cios11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor hora: ");
		double valorH = scan.nextDouble();
		
		System.out.println("Digite as horas trabalhadas: ");
		double horasTrabalho = scan.nextDouble();
		
		double sal�rioBruto = valorH * horasTrabalho;
		int percentualIr = 0;
		
		if (sal�rioBruto <= 900) {
			percentualIr = 0;
			System.out.println("N�o h� desconto, o colaborador � insento.");
			
		} else if (sal�rioBruto > 900 && sal�rioBruto <= 1500 ) {
			percentualIr = 5; 
				
		 } else if (sal�rioBruto > 1500 && sal�rioBruto <= 2500) {
			 percentualIr = 10;
			 
		 } else if (sal�rioBruto > 2500) {
			 percentualIr = 20;
		 }
		
		double ir = (sal�rioBruto / 100) * percentualIr;
		double inss = (sal�rioBruto / 100) * 10;
		double fgts = (sal�rioBruto/ 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = sal�rioBruto - totalDescontos; 
		
		System.out.println("Total desconto IR: " + percentualIr);
		System.out.println("Total desconto INSS: " + inss);
		System.out.println("Total desconto FGTS: " + fgts);
		System.out.println("Sal�rio l�quido: " + salarioLiquido);
		System.out.println("Total de descontos: " + totalDescontos);
		
		
		
	}
		
}
