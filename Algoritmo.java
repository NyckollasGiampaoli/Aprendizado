package exercícios;

import java.util.Scanner;

public class Algoritmo {

	static Scanner leia = new Scanner(System.in);
 
    public static void main (String[] args) {
	
        int n;
        int div = 3;
        int dov = 7;

        System.out.println ("Informe um número que seja "
     	+ "divisível por 3 e por 7");
        n = leia.nextInt();
     
        n = (n / div);
        n = (n / dov);
        
        if (n >= 1) {
           System.out.println ("O número é " + n +", divisível por 3 e por 7");
     
        } else {
	       System.out.println ("O número não é divisível por 3 e por 7");
     
        }

    }

}