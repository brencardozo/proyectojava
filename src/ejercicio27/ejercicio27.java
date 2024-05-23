package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int contrasena = 2007;
		int intentos = 3;
		boolean Notieneintentos = false;

		do {

			System.out.println("\ningrese la contraseña: ");
			contrasena = datos.nextInt();
			System.out.println("quedan : " + intentos);

			intentos--;

			if (intentos == 0) {
				Notieneintentos = true;
			} else if (contrasena != 2007) {
				System.err.println("contraseña incorrecta");

			}

		}

		while (contrasena != 2007 && Notieneintentos == false);
		{

			if (contrasena == 2007) {
				System.out.println("entrando...");

			}

			else {
				System.out.println("computadora bloqueada");

			}

		}

	}
}