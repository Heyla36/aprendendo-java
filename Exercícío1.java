package exerc�cios2;

import java.util.Scanner;

public class Exerc�c�o1 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Insira o primeiro n�mero: ");
	double num1 = scan.nextDouble();
	
	System.out.println("Insira o segundo n�mero: ");
	double num2 = scan.nextDouble();
	
	if(num1 > num2) {
		System.out.println(num1 + " � maior que " + num2);
		
	} else if (num2 > num1) {
		System.out.println(num2 + " � maior que " + num1);
		
	} else {
		System.out.println("Os n�meros s�o iguais.");
		
	}
	}

}
