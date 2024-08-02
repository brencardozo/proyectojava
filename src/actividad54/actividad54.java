package actividad54;

import java.util.ArrayList;
import java.util.Scanner;

public class actividad54 {

	static boolean seEncontro = false;
	static int codigo;
	static int[] numeros = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
	static String[] nombres = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };

	static Scanner datos = new Scanner(System.in);

	public static int igresarSocio() {

		System.out.println("Ingrese el codigo: ");
		codigo = datos.nextInt();

		return codigo;
	}

	public static void analizaSocio(int codigo) {

		for (int i = 0; i < numeros.length; i++) {

			if (codigo == numeros[i]) {

				System.err.println("se encontro el codigo " + numeros[i]);
				System.out.println("Su nombre es: " + nombres[i]);
				seEncontro = true;

			}

		}
		
		if (seEncontro == false ) {
			System.out.println("No se encontro el numero ingresado.");
		}
	}

	public static void main(String[] args) {

		analizaSocio(igresarSocio());

	}

}
