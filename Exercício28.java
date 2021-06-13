package exercícios3;

import java.util.Scanner;

public class Exercício28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		int num = scan.nextInt();
		boolean primo;
		
		for (int i = 1; i <=num; i++) {
			
			primo = true;
			
			for(int j= 2; j < j ; j++) {
				if (i % j == 0) {
					//System.out.println("Não é primo - divisível por: " + j);
					primo = false;
				}
			}
				if(primo){
					System.out.println("É primo");
					
				}
		}
		
		scan.close();
		
	}
}
