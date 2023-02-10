package exercícios;

import java.util.Scanner;

public class Classificar {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = 0;
		int soma = 0;
		double media = 0;
		int maior = 0;
		int menor = 1000000;
	    int quant = 0;
		
		while (n >= 0) {
			
			System.out.println ("Informe os números: ");
			n = leia.nextInt();
	
			if (n < 0) {
			    break;
			}
	        quant++;
	        
			soma = soma + n;
			media = (double)soma / quant;
			
			if (n > maior) {	
				maior = n;
			}
			if (n < menor) {
				menor = n;
			}
		}
		System.out.println ("Média: " + media);
		System.out.println ("Número maior: " + maior);
		System.out.println ("Número menor: " + menor);
	}
}
