package ejercicio45;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ejercicio45 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		List<String> lista = new ArrayList<>();

		lista.add("argentina");
		lista.add("bolivia");
		lista.add("brasil");
		lista.add("chile");
		lista.add("colombia");
		lista.add("ecuador");
		lista.add("guyana");
		lista.add("paraguay");
		lista.add("perú");
		lista.add("surinam");
		lista.add("uruguay");
		lista.add("venezuela");

		Collections.sort(lista); // Ordena la lista

		System.out.println("Ingrese el nombre de un país: ");
		String pais = datos.nextLine();

		boolean encontrado = false;
		
		for (int i = 0; i < lista.size(); i++) {

			// pais.equals(lista.get(i) ) seria como pais == lista.get(i)

			if (pais.equals(lista.get(i))) {

				System.out.println("Es un pais sudamericano");
				encontrado =true;
			}
			
		}
		if (encontrado == false) {
			System.out.println("no es sudamericano");
		}
			}
}
