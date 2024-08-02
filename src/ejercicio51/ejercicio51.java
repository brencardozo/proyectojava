package ejercicio51;

import java.util.Scanner;

public class ejercicio51 {
	static int numero;
	static Scanner datos = new Scanner(System.in);
	
	public static int ingresarNumero() {
		
		System.out.println("INGRESAR NUMERO");
		numero= datos.nextInt();
		return  numero;
	}
	 
	public static void numero() {
		
		System.out.println("EL NUMERO ES: "+ numero);
		
	}
	public static boolean  Nose (String positivo) {
		if(numero >0 ) {
			
			
			return true;
		}
		
		
		
		else { System.err.println("\nnegativo");
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ingresarNumero();
		numero() ;
		System.out.println (Nose("false") );
		
		
		
	}

}
