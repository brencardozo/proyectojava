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
	    
	    �Lleva par�metros y argumentos esta funci�n?�Por qu�?
	    No lleva parametro, porque no hay. y argumento tampoco, porque en los parentesis no hay nada.*/
	    
	   /*definicion: Parametro, valor que se espera la funcion y los argumentos son los valores que le damos a la funcion.
	    */
	    /*�Cu�l es la variable local, y cu�l la global? Mencion� dos diferencias entre variables locales y globales.
                 la variable local es la variable nombre y el global es apellido*/
	   /* diferencia: la variable local almacena temporalmente los datos de una funcion para despues destruirse. y la global pertenece a cada funcion y solo ocupa memoria cuando se llama la funcion.*/
	}
	 
	 
	 static float altura = 1.8f;
	 
	 public static float almacenarAltura(float a ) {
		 
		a= altura;
		
		return a;
		
		/*Coment� el proceso, es decir: variable global -> argumento -> par�metro -> funci�n -> retorno -> mostrar resultado en un syso.
           Ahora, en el argumento de la funci�n principal, en vez de colocar �altura�, coloc� 1.75f. �Qu� ocurri�? 
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


