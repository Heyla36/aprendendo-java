package exercícios3;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean valor = false;
		double popA, popB, cont = 0;
		double taxaA, taxaB;
		
		do {
		System.out.println("Insira a quantidade de habitantes A: ");
		popA = scan.nextInt();
		
		if(popA > 0) {
			valor = true;
			
		}else {
			System.out.println("População A precisa ter um valor: ");
		
		}
		
	}while(!valor);
		
		do {
			System.out.println("Insira a quantidade de habitante B: ");
			popB = scan.nextInt();
		
			if(popB > 0){
				valor = true;
				
			}else {
				System.out.println("População B precisa ter um valor: ");
			
			}
			
	}while(!valor);
		
		do {
			System.out.println("Insira a taxa de crescimento A: ");
			taxaA = scan.nextDouble();
		
			if(taxaA > 0){
				valor = true;
				
			}else {
				System.out.println("Taxa A precisa ter um valor: ");
			
			}
			
	}while(!valor);
		
		do {
			System.out.println("Insira a taxa de crescimento B: ");
			taxaB = scan.nextDouble();
		
			if(taxaB > 0){
				valor = true;
				
			}else {
				System.out.println("Taxa B precisa ter um valor: ");
			
			}
			
	}while(!valor);
		
		while(popA < popB) {
			popA += (popA / 100) * taxaA;
			popB += (popA / 100) * taxaB;
			cont++;
		}
		
		System.out.printf("População A: %.1f%n", popA);
		System.out.printf("População B: %.1f%n ", popB);
		System.out.println("Anos: " + cont);
		
		scan.close();
	}

}
