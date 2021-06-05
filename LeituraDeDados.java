package dadosTeclado.aula12;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Esse código é necessário para poder usar o Scan
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);

		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		System.out.println("Você tem bicho de estimação: ");
		boolean bEstimação = scan.nextBoolean();
		
		System.out.println("Tem bicho de estimação?" + bEstimação);
	}

}
