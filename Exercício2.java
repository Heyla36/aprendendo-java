package exercícios3;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String user;
		String senha;
		boolean cadastro = false;
		
		do {
			
		System.out.println("Digite o nome de usuário: ");
		 user = scan.next();
		
		System.out.println("Digite a senha: ");
		 senha = scan.next();
		
		if(user.equalsIgnoreCase(senha)){
			cadastro = false;
			System.out.println("A senha está igual ao nome de usuário! Digite novamente");
			
		}else {
			cadastro = true;
			System.out.println("Cadastro criado com sucesso");
		}
		
		}while(!cadastro);
		
		
		scan.close();
	}

}
