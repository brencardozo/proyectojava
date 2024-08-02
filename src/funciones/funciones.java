package funciones;

import java.util.Scanner;

public class funciones {

	 static Scanner datos = new Scanner(System.in); 
	 
	static String apellido;
	
	
	public static void ingresarNombre() {
		
		System.out.println("ingrese su nombre: ");
		String nombre = datos.next();
		System.out.println("ingrese su apellido: ");
	    apellido = datos.next(); /*
	    
	    ¿Lleva parámetros y argumentos esta función?¿Por qué?
	    No lleva parametro, porque no hay. y argumento tampoco, porque en los parentesis no hay nada.*/
	    
	   /*definicion: Parametro, valor que se espera la funcion y los argumentos son los valores que le damos a la funcion.
	    */
	    /*¿Cuál es la variable local, y cuál la global? Mencioná dos diferencias entre variables locales y globales.
                 la variable local es la variable nombre y el global es apellido*/
	   /* diferencia: la variable local almacena temporalmente los datos de una funcion para despues destruirse. y la global pertenece a cada funcion y solo ocupa memoria cuando se llama la funcion.*/
	}
	 
	 
	 static float altura = 1.8f;
	 
	 public static float almacenarAltura(float a ) {
		 
		a= altura;
		
		return a;
		
		/*Comentá el proceso, es decir: variable global -> argumento -> parámetro -> función -> retorno -> mostrar resultado en un syso.
           Ahora, en el argumento de la función principal, en vez de colocar “altura”, colocá 1.75f. ¿Qué ocurrió? 
*/
	 }
	  
	
	 public static int filtrarEdad(int edad) {
		 if(edad>=18) {
			return edad; 
			
		 }
		 
		 else {System.out.println("No");}
		 return -1;
	 }
	
	 
	// FUNCION ANALIZARSITRABAJA
	    public static boolean analizarSiTrabaja (String respuesta) {
	       
	        if (respuesta.equalsIgnoreCase("si")) {
	            return true;
	        } else {
	            return false;}
	        }
	
		
	}
	    // FUNCION CANTIDADANIMALES
	    public static void cantidadAnimales(int gatos, int perros) {
	    	
	        System.out.println("La cantidad de perros es: "+ perros);
	        System.out.println("La cantidad de gatos es: "+ gatos);
	    }

		   // FUNCION PRINCIPAL
		    public static void main(String[] args) {
		        ingresarNombre();
		        System.out.println("");
		      
		        System.out.println("Apellido: "+apellido);
		        System.out.println("La altura de la persona es: " + almacenarAltura(altura) );
		        System.out.println("");
		       
		        System.out.println("La edad de la persona es: "+filtrarEdad(10) );
		        System.out.println("");
		       
		        System.out.println("Trabaja? "+ analizarSiTrabaja("no") );
		        System.out.println("");
		       
		        cantidadAnimales(5, 7);
		        System.out.println("");
		    }
	
	
	
	 }


