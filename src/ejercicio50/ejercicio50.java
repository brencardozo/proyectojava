package ejercicio50;

import java.util.Scanner;

public class ejercicio50 {
	static Scanner datos = new Scanner(System.in);
	static String nombre;

		public static void ingresarDatos() {
		System.out.println("ingrese nombre: ");
		 nombre= datos.next();
	}
		
		public static void Nombres( ) {
			
			System.out.println("el nombre es: " +nombre);
			
			
		}
		
		
		
		public static void main(String[] args) {
			ingresarDatos();
			ingresarDatos();
			ingresarDatos();
		     Nombres();
		     Nombres(); Nombres();
			
}}
