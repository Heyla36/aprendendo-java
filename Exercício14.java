package exerc�cios;

import java.util.Scanner;

public class Exerc�cio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo: ");
		
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Digite a velocidade da internet: ");
		
		double velNet = scan.nextDouble();
		
		double resultado = tamArquivo / velNet;
		
		System.out.println("A velocidade aproximada de download ser�: " + resultado + " minutos" );
		
		

	}

}
