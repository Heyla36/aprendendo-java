package exercícios3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário do funcionário: ");
		double salario = scan.nextDouble(); //95
		double percentual = 1.5;
		
		salario += (salario / 100) * percentual; // 96
		
		DecimalFormat format = new DecimalFormat ("###,###,###");
		
		for (int i = 1997; i <= 2021; i++) {
			percentual *= 2;
			salario += (salario / 100) * percentual;
			
			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%" );
		}
		
		scan.close();
	}

}
