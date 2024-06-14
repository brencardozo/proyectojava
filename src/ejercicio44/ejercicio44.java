package ejercicio44;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.HashSet;

public class ejercicio44 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		
	
        System.out.println("Ingrese los equipos (escriba 'fin' para terminar):");
        String entrada = datos.nextLine();
	
		
	while(!entrada.equalsIgnoreCase("fin")) {
		lista.add(entrada);
		entrada  = datos.nextLine();
		
		
	}
	HashSet<String> set = new HashSet<>(lista);
	
	System.out.println("\tLISTA CREADA");
		for (String elemento : lista) {
			
			System.out.println(elemento);
			
			lista.clear();
			lista.addAll(set);
			
		}
		}
		
	}

