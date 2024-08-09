package ejercicio59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio59 {
	static Scanner datos = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			System.out.println("Ingrese la edad: ");
			int edad = datos.nextInt();

			if (edad <= 0) {

				throw new ArithmeticException();
			}
		} 
		catch (ArithmeticException e) {
        System.err.println("Error: Ingresar solo numeros positivos.");
		}
		
		catch (InputMismatchException e) {
		System.err.println("Error: Ingresar solo datos validos.");
		}
		
		finally { 
        System.out.println("Fin.");
        }
		
	}
}