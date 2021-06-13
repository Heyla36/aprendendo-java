package exercícios3;

import java.util.Scanner;

public class Exercício29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Montar a tabuada de: ");
		int num = scan.nextInt();
		
		boolean invalido = true;
		int numFinal, numInicio;
		
		do {
		
		System.out.println("Entre com o ínicio da tabuada: ");
		numInicio = scan.nextInt();
		
		System.out.println("Entre com o fim da tabuada: ");
		numFinal = scan.nextInt();
		
			if (numFinal < numInicio){
			invalido = false;
			
			}
		}while(!invalido);
		
		System.out.println("Tabuada de: " + num );
		System.out.println("Começar por: " + numInicio );
		System.out.println("Terminar em: " + numFinal + "\n" );
		
		for(int i = numInicio; i <= numFinal ; i++) {
			System.out.println(num + " x " + i + " = " + (num * 1));
			
		}
		
		scan.close();

		}
	

 }
