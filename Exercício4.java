package exercícios2;

import java.util.Scanner;

public class Exercício4 {
 public static void main(String[] args) {
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Digite uma letra para saber se ela é vogal ou consoante: ");
	 String letra = scan.next();
	 
	 if(letra.length() > 1 ) {
		System.out.println("Isso não é uma letra.");
		 
	 } else if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") ||
			 letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || 
			 letra.equalsIgnoreCase("U")  ) {
		 
			System.out.println(" é uma vogal.");
 		
	 	} else {
	 	System.out.println(" é uma consoante");	
	 		
	 	}
 
}
}
