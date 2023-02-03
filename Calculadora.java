package metodos;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner leia = new Scanner(System.in);
	
    public static void main (String [] args) {
		
	    int n1;
        int n2;
        double resultado = 0;
        int option;
        boolean calculoRealizado = true;
    
        System.out.println ("Informe o primeiro número");
        n1 = leia.nextInt();
    
    
        System.out.println ("Informe o segundo número");
        n2 = leia.nextInt();
    
        System.out.println ("Escolha uma dessas opções:");
        System.out.println("\n1(somar), 2(subtrair), 3(multiplicar), e 4(dividir)");
        option = leia.nextInt();
    
        switch(option) {
    
            case 1:
            System.out.println ("Opção 1: Somar");
            resultado = somar(n1, n2);
            break;
    
            case 2:
            System.out.println ("Opção 2: Subtrair");
            resultado = subtrair(n1, n2);
            break;
    
            case 3:
            System.out.println ("Opção 3: Multiplicar");
            resultado = multiplicar(n1, n2);
            break;
    
            case 4:
    	    System.out.println ("Opção 4: Dividir");
            resultado = dividir(n1, n2);
            break;
    
            default:
    	    System.out.println ("Opção Inválida");
            calculoRealizado = false;
    	    break;
    
        }   

	    if (calculoRealizado) {
    	
            System.out.println ("O resultado é " + resultado);

        }
    }

    public static int somar(int x, int y) {
	
	    int resultado = x + y;
	    return resultado;
    }

    public static int subtrair(int a, int b) {
    
        int resultado = a - b;
        return resultado;
    }
    
    
    public static int multiplicar(int c, int d) {
    
        int resultado = c * d;
        return resultado;		
    }
    
    public static double dividir (int y, int z) {
    
        double resultado = (double)y / (double)z;
        return resultado;
    }
        
}