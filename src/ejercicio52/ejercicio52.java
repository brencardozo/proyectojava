package ejercicio52;

import java.util.Scanner;

public class ejercicio52 {
	static Scanner datos = new Scanner(System.in);
	
	
	 static float  costo;
	 
	  public static void analizarDescuentoo(float costo) {
	  
	  if (costo> 15000) {
		  float descuento = (float) ((costo)*0.10);  
		  
		  System.out.println("Se aplico un descuiento del 10%: " + "$"+ descuento);
		  float costoFinal = costo - descuento;
		  System.out.println("el monto totaled: "+"$"+ (costoFinal));
	   }
	 
	  else { 
		  System.out.println("costo total: $"+ costo);
	  }
		  
	 
	  }

	  public static float ingresarCosto() {
		
		 System.out.println("Ingrese el monto del dinero: ");
		 float costoInicial =datos.nextFloat();
		 return costoInicial;
		  
	}
	 
	  public static void main(String[] args) {
		  analizarDescuentoo(ingresarCosto());
		 
	  
}
}