package exerc�cios3;

public class Exerc�cio4 {
	
	public static void main(String[] args) {
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while(popA < popB) {
			popA += ( popA / 100 ) * 3; // += serve para receber indeterminada classe como double :D
			popB += ( popB / 100) * 1.5;
			cont++;
		}
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Anos: " + cont);
		
		
	}
	
	
}
