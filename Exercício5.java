package exerc�cios;

import java.util.Scanner;

public class Exerc�cio5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
			System.out.println("Entre com a quantidade de metros: ");
		
		double metros = scan.nextDouble();
			
		double cm = metros * 100;
		
		System.out.println(metros + " metros s�o: " + cm + " cent�metros");
	}
	
	

}
