package exerc�cios2;

import java.util.Scanner;

public class Exerc�cio4 {
 public static void main(String[] args) {
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Digite uma letra para saber se ela � vogal ou consoante: ");
	 String letra = scan.next();
	 
	 if(letra.length() > 1 ) {
		System.out.println("Isso n�o � uma letra.");
		 
	 } else if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") ||
			 letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || 
			 letra.equalsIgnoreCase("U")  ) {
		 
			System.out.println(" � uma vogal.");
 		
	 	} else {
	 	System.out.println(" � uma consoante");	
	 		
	 	}
 
}
}
