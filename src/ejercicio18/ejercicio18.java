package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("\tBIENVENIDO!");
		System.out.println("\nElija el caf�");
		System.out.println("\n1.caf� cortado");
		System.out.println("2. caf� Latte");
		System.out.println("3. caf� solo");
		System.out.println("4. caf� l�grima");
		opcion = dato.nextInt();
		
		switch(opcion) {
		
		case 1:
			System.out.println("Eligi� caf� cortado.");
			break;
			
		case 2: 
			System.out.println("Eligi� caf� latte.");
			break;
			
		case 3: 
			System.out.println("Eligio caf� solo.");
			break;
			
		case 4: 
			System.out.println("Eligi� caf� lagrima.");
			break;
			
		default:
			System.err.println("Opci�n incorrecta!");
		
			
			
		}
		
		
		
		
	}
		
	  
	}


