package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {

		Scanner dato = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("ingrese un numero");
		num1 = dato.nextInt();
		System.out.println("ingrese otro numero");
		num2 = dato.nextInt();
		System.out.println("ingrese otro numero");
		num3 = dato.nextInt();
		
		if ( num1> num2 && num2>num3) {
			System.out.println("El mayor es: " + num1);
			System.out.println("El intermedio es: " + num2);
			System.out.println("El mayor es: " + num3);
		}
		
		else if ( num1> num3 && num3>num2) {
			System.out.println("El mayor es: " + num1);
			System.out.println("El intermedio es: " + num3);
			System.out.println("El mayor es: " + num2);
		}
		

		else if ( num2> num1 && num1>num3) {
			System.out.println("El mayor es: " + num2);
			System.out.println("El intermedio es: " + num1);
			System.out.println("El menor es: " + num3);
		}
		
		else if ( num2> num3 && num3> num1) {
			System.out.println("El mayor es: " + num2);
			System.out.println("El intermedio es: " + num3);
			System.out.println("El menorr es: " + num1);
		}
		
		else if ( num3> num2 && num2> num1) {
			System.out.println("El mayor es: " + num3);
			System.out.println("El intermedio es: " + num2);
			System.out.println("El menor es: " + num1);
		}
		
		else if ( num3> num1 && num1> num2) {
			System.out.println("El mayor es: " + num3);
			System.out.println("El intermedio es: " + num1);
			System.out.println("El menor es: " + num2);
		}
	}
}
