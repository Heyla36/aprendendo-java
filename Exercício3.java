package exerc�cios2;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu sexo apenas com a letra inicial: ");
	
		String input = scan.next();		
		
		if (input.equalsIgnoreCase("f") ) {
			System.out.println("Voc� � do sexo feminino.");
			
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("Voc� � do sexo masculino.");
			
		} else {
			System.out.println("Sexo indefinido");
		}

	}

}
