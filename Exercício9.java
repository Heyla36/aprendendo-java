package exerc�cios2;

import java.util.Scanner;

public class Exerc�cio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno voc� estuda?");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("M") || turno.equalsIgnoreCase("Matutino")) {
			System.out.println("Bom dia!");
		
		} else if (turno.equalsIgnoreCase("V") || turno.equalsIgnoreCase("Vespertino")) {
			System.out.println("Boa tarde!");
		
		} else if (turno.equalsIgnoreCase("N") || turno.equalsIgnoreCase("Noturno")) {
			System.out.println("Boa noite!");
		
		} else {
			System.out.println("Valor inv�lido.");
		}
		
		

	}

}
