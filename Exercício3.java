package exercícios3;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, sexo, estCivil;
		int idade;
		int salario;
		
		
		do {
			System.out.println("Digite seu nome: ");
			nome = scan.next();
			
			if(nome.length() < 3) {
				infoValida = false;
				System.out.println("Por favor insira um nome válido: ");
				
			}else {
				infoValida = true;
				
			}
			
		}while (!infoValida);
		
		do {
			System.out.println("Insira sua idade: ");
			idade = scan.nextInt();
			
			if(idade > 150) {
				infoValida = false;
				System.out.println("Por favor insira uma idade válida: ");
			
			}else {
				infoValida = true;
				
			}
		}while (!infoValida);
		
		do {
			System.out.println("Insira seu salário: ");
			salario = scan.nextInt();
			
			if(salario <= 0) {
				infoValida = false;
				System.out.println("Por favor insira uma quantia válida: ");
			
			}else {
				infoValida = true;
				
			}
		}while (!infoValida);
		
		do {
			System.out.println("Insira seu sexo: ");
			sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				infoValida = true;
				
			}else {
				infoValida = false;
				System.out.println("Insira um sexo válido: ");
				
			}
		}while (!infoValida);
		
		do {
			System.out.println("Insira seu estado civil: ");
			estCivil = scan.next();
			
			if(estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("c") 
					|| estCivil.equalsIgnoreCase("v") || estCivil.equalsIgnoreCase("d")) {
				infoValida = true;
				
			}else {
				infoValida = false;
				System.out.println("Entre com um valor válido: ");
				
			}
		}while (!infoValida);
		
		System.out.println("NOME: " + nome);
		System.out.println("IDADE: " + idade);
		System.out.println("SALARIO: " + salario);
		System.out.println("SEXO: " + sexo);
		System.out.println("ESTADO CIVIL: " + estCivil);
		
		
		
		
		scan.close();

	}

}
