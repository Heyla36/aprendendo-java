package exercícios2;

import java.util.Scanner;

public class Exercício17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano");
		int ano = scan.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 !=0)) {
			System.out.println("É um ano bissexto!");
			
		} else {
			System.out.println("Não é um ano bissexto!"); 
		}
	}

}

