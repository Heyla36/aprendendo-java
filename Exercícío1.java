package exercícios2;

import java.util.Scanner;

public class Exercícío1 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira o primeiro número: ");
	double num1 = scan.nextDouble();
	
	System.out.println("Insira o segundo número: ");
	double num2 = scan.nextDouble();
	
	if(num1 > num2) {
		System.out.println(num1 + " é maior que " + num2);
		
	} else if (num2 > num1) {
		System.out.println(num2 + " é maior que " + num1);
		
	} else {
		System.out.println("Os números são iguais.");
		
	}
	}

}
