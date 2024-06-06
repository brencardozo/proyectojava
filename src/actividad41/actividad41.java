package actividad41;

import java.util.Scanner;

public class actividad41 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String [] nombre = new String[4];
		
		int [] edad = {"ihuhf "};
		
		
		for (int i=0; i<4; i++) {
			System.out.println("Ingrese los nombres de los jugadores: ");
			 nombre[i] = datos.next();
			
			System.out.println("Ingrese las edades: ");
			 edad[i] = datos.nextInt();
			 
			
		}
		
		for (String nombres : nombre ) {
			
			System.out.println(nombres+"");
			
		}
		
		for (int edades : edad ) {
			
			System.out.println(edades+"");
			
		}

	}

}
