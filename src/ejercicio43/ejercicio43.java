package ejercicio43;

import java.util.Scanner;

public class ejercicio43 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int[] numeros = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };

		String[] nombres = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };

		System.out.println("Ingrese el codigo: ");
		int codigo = datos.nextInt();

		boolean caca = false;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] %2 == 0) {
			System.out.println("Numero " + numeros[i] +" descartado");
				continue;
			}

			if (codigo == numeros[i]) {

				System.err.println("se encontro el codigo " + numeros[i]);
				System.out.println("Su nombre es: " + nombres[i]);
				caca = true;
				break;

			}

		}

		if (caca == false) {
			System.out.println("No encontro el numero");
		}

	}

}
