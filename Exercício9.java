package exerc�cios;

import java.util.Scanner;

public class Exerc�cio9 {

	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		
		double f = scan.nextDouble();
		
		double c = (5 * (f - 32) / 9);
		
		System.out.println("A temperatura em celsius �: " + c + " C");*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em celsius: ");
		
		double c = scan.nextDouble();
		
		double f = (c * 9/5) + 32;
		
		System.out.println("A temperatura em celsius �: " + f + " F");
		

	}

}
