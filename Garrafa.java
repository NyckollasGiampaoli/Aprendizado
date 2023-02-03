package metodos;

import java.util.Scanner;

public class Garrafa {
	
    static Scanner leia = new Scanner(System.in); 

	public static void main(String[] args) {
		
        boolean tampa = true;
        String opcao;
        
        while(true) {
        	
        	System.out.println ("Você deseja abrir ou fechar a garrafa?");
            opcao = leia.next();      
            
            if (opcao.equals("abrir")) {
            
            	tampa = abrir(tampa);
            	System.out.println(tampa);
         
            }else if(opcao.equals("fechar")){
            
            
                tampa = fechar(tampa);
            }else {
            	break;
            }
            System.out.println(System.lineSeparator().repeat(6));
        }
        
	}

	static boolean abrir(boolean tampa) {
	    tampa = true;
		System.out.println ("A garrafa abriu!");
	    return tampa;
	}
	
	static boolean fechar(boolean tampa) {	
		tampa = false;
		System.out.println ("A garrafa está fechada!");
		return tampa;
	}
}
