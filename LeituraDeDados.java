package dadosTeclado.aula12;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Esse c�digo � necess�rio para poder usar o Scan
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);

		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �: " + altura);
		
		System.out.println("Voc� tem bicho de estima��o: ");
		boolean bEstima��o = scan.nextBoolean();
		
		System.out.println("Tem bicho de estima��o?" + bEstima��o);
	}

}
