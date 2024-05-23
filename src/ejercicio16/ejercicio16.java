package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {

		Scanner dato = new Scanner(System.in);

		int hora = 0, segundo = 0, minuto = 0;

		System.out.println("Ingrese la hora: ");
		hora = dato.nextInt();

		if (hora > 23 || hora < 0) {
			System.out.println("horario ingresado supero las 23hs");

		}
		else {
			System.out.println("horario ingresado correcto" + hora);

		}

		System.out.println("Ingrese los minutos: ");
		minuto = dato.nextInt();

		if (minuto > 59 || minuto < 0) {
			System.out.println("horario ingresado supero los 60mins");
		}
		else {
			System.out.println("horario ingresado correcto" + minuto);
		}
		
		if (segundo > 59 ||segundo < 0) {
			System.out.println("horario ingresado supero los 60mseg");
		}
		else {
			System.out.println("horario ingresado correcto" + segundo);
		
		}
	}
}
