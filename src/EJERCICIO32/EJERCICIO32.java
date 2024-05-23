package EJERCICIO32;

import java.util.Scanner;

public class EJERCICIO32 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int num;

		System.out.println("Ingrese un numero para multiplicar: ");
		num = datos.nextInt();

		for (int i = 1; i <= 20; i++) {

			int result = num * i;

			System.out.println(num + " x " + i + "=" + result);

		}

	}

}
