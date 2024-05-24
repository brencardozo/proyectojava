package ejercicio35;

import java.util.Scanner;

public class ejercicio35 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
	
		int notamax =-999999999;
		int notamin = 999999999;
				
				
		for( int nota = 0; nota < 5; nota++ ) {
			System.out.println("ingrese calificacion:" );
			
            int notas = datos.nextInt();
           
            if (notas<notamin ) {
        	  notamin=notas;
        	}  
            
             if(notas > notamax) {
            	notamax=notas;
            }
		
        }
		System.out.println("nota min:"+ notamin);
        System.out.println("nota maxima: " + notamax);

			
			
		}
	}


