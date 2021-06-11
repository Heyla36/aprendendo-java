package exercícios2;

import java.util.Scanner;

public class Exercício21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de litros vendidos: ");
		double litros = scan.nextDouble();
			
		System.out.println("Insira o tipo de combustível: ");
		String tipo = scan.next();
		double gasolina = 2.50;
		double alcool = 1.90;
		double desc = 0;
		double total = 0;
		
		
		if (tipo.equalsIgnoreCase("a")) {
			
			if (litros <= 20) {
				desc = 3;
			
			}  else {
				desc = 5;
			}
			
			total = litros * alcool;
			
		} if (tipo.equalsIgnoreCase("g")) {
			
			if (litros <= 20) {
				desc = 4;
			
			}else {
				desc = 6;
			}
			total = litros * gasolina;
		}
		
		double totalDesc = (total / 100) * desc;	
			 
		double preçoAPagar = total - totalDesc;
				
		System.out.println("O preço do combústivel está: " + preçoAPagar);
		
	}

}
