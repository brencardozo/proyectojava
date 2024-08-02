package actividad53;

import java.util.Scanner;

public class actividad53 {
	
	static int notas;
	static Scanner  datos = new Scanner(System.in);
	
	static int notamax =-999999999;
	static int notamin = 999999999;
			
	public static int ingresarCalificacion() {
       System.out.println("ingrese calificacion:" );
        notas = datos.nextInt();
	return notas;
	}
        public static int analizarNota( int notas) {
        	if (notas<notamin ) {
    	  notamin=notas;
    	  return notamin;
        	}
    	   if(notas > notamax) {
        	notamax=notas;
        }
    	   return notamax;
    	   }
	
    
        public static void mostrarCali() {
			
		
	System.out.println("nota min:"+ notamin);
    System.out.println("nota maxima: " + notamax);

        }
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		analizarNota(ingresarCalificacion());
		analizarNota(ingresarCalificacion());
		analizarNota(ingresarCalificacion());
		analizarNota(ingresarCalificacion());
		analizarNota(ingresarCalificacion());
		analizarNota(ingresarCalificacion());
		mostrarCali();
		
		
		
		
		
	}

}
