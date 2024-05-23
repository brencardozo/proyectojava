package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("\tBIENVENIDO!");
		System.out.println("\nElija el café");
		System.out.println("\n1.café cortado");
		System.out.println("2. café Latte");
		System.out.println("3. café solo");
		System.out.println("4. café lágrima");
		opcion = dato.nextInt();
		
		switch(opcion) {
		
		case 1:
			System.out.println("Eligió café cortado.");
			break;
			
		case 2: 
			System.out.println("Eligió café latte.");
			break;
			
		case 3: 
			System.out.println("Eligio café solo.");
			break;
			
		case 4: 
			System.out.println("Eligió café lagrima.");
			break;
			
		default:
			System.err.println("Opción incorrecta!");
		
			
			
		}
		
		
		
		
	}
		
	  
	}


