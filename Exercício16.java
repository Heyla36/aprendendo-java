package exercícios2;

import java.util.Scanner;

public class Exercício16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor de a: ");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("A equação não é de segundo grau.");
		
		}else {
		
			System.out.println("Insira o valor de b: ");
			int b = scan.nextInt();
		
			System.out.println("Insira o valor de c: ");
			int c = scan.nextInt();
			
			double delta = Math.pow(b, 2) - (4 * a * c);
			
			if (delta < 0) {
				System.out.println("A equação não possui raízes reais.");
			
			} else {
				
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("Valor Delta: " + delta);
				System.out.println("x1 =" + x1);
				System.out.println("x2 =" + x2);
				
			} //ESSA DAQUI É DIFICIL MAS DA PRA RESOLVER  NA BASE DA PESQUISA!!!!!!!!!
		}
	}
	
}
