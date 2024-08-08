package ejercicio55;



import java.util.Arrays;
import java.util.Scanner;

public class ejercicio55 {
	static Scanner datos = new Scanner(System.in);
	static int [] dni = new int[3];
	
	public static void ingresoDni() {;
		
	for (int i = 0; i < 3; i++) {
		System.out.println("ingresar el dni: " );
		dni[i] = datos.nextInt();
		  
	}
	
	}
	
	public static void ordenarDni() {
		
			for (int i = 0; i < 3-1; i++) { 
				
			for (int j = 0; j < 3 - i - 1 ; j++) {
					
			if (dni[j] > dni[j+1]) {
						
			int tempdni = dni[j];
            dni [j] =dni[j+1];
            dni[j+1]=tempdni;
 
			}
		
	}
			}		
				
		
		
		
System.out.println("ordenado");

for (int num : dni) {
	
	System.out.println(num+"");
}
			
}

	public static void main(String[] args) {
		ingresoDni();
		ordenarDni();
	}

}
