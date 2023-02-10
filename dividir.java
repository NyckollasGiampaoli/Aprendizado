package exercícios;

import java.util.Scanner;

public class dividir {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = 0;
		int guar = 0;
		
		while (n < 200) {
				System.out.println ("Coloque todos os números que sejam divisíveis por 5:");
				n = leia.nextInt();
				
				if(n % 5 == 0) {
					guar = n;
				System.out.println ("O número " + n + " é divisível por 5");
			}else {
				System.out.println ("O número NÃO é divisível por 5");
			}
				System.out.println ("Números divisíveis por 5: " + guar);
		}
		
	}
}
