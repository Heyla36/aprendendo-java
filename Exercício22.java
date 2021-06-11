package exercícios2;

import java.util.Scanner;

public class Exercício22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Quantos kg irá levar de morango:");
		double kgMorango = scan.nextDouble();
		
		System.out.println("Quantos kg irá levar de maçã:");
		double kgMaca = scan.nextDouble();
		double morango = 0;
				
		if (kgMorango <=5) {
				morango = 2.50;
				
			} else {
				morango = 2.20;
		}
		
		double maca = 0;
		
		if (kgMaca <=5) {
			maca = 1.80;
			
		} else {
			maca = 1.50;
	}
		
		double precoMor = morango * kgMorango;
		double precoMaca = maca * kgMaca;
		double precoParcial = precoMor + precoMaca;
		double precoTotal = precoParcial;
				
		if (kgMorango + kgMaca >8 || precoParcial > 25){
			precoTotal = precoParcial - (precoParcial / 100) * 10;
		} 
		
	
		System.out.println("Total a pagar: " + precoTotal);
	} 	

}
