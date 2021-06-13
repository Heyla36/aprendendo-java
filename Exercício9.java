package exercícios3;

import java.util.Scanner;

public class Exercício9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1 ; i < 50 ; i++ ) {
			
			if(i % 2 != 0) { // todo número dividido por 2 que der zero será par
				System.out.println(i);
				
			}
		}
		
		scan.close();
	}

}
