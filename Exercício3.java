package exercícios2;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu sexo apenas com a letra inicial: ");
	
		String input = scan.next();		
		
		if (input.equalsIgnoreCase("f") ) {
			System.out.println("Você é do sexo feminino.");
			
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("Você é do sexo masculino.");
			
		} else {
			System.out.println("Sexo indefinido");
		}

	}

}
