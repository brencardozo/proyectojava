package ejercicio60;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio60 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		while() {
		try {
			System.out.println("Ingrese un numero: ");
			int num = datos.nextInt();
			
			if (num <0) {
			throw new ArithmeticException();
			
		}}
		}
			catch (ArithmeticException e) {
		        System.err.println("Error: Ingresar solo numeros enteros.");
			 
				
			}
		
	}
	}

