package exercícios3;

import java.util.Scanner;

public class Exercício27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de temperaturas: ");
		double temps = scan.nextDouble();
		double temp;
		double soma = 0;
		double media;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		
		for(int i = 1; i <= temps; i++) {
			System.out.println("Informe o valor da temperatura " + i + ":");
			temp = scan.nextDouble();
			
			soma += temp;
			
			if(temp > maior) {
				maior = temp;
			}
			if(temp < menor) {
				menor = temp;
			}
		}
		
		media = soma / temps;
		
		System.out.println("Média das temperaturas: " + media);
		System.out.println("Menor temperatura: " + menor + "\nMaior Temperatura: " + maior);
		
		
		scan.close();

	}

}
