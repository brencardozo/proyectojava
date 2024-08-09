package ejemplo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner entrada = new Scanner (System.in);
			
	        
	        // TRY intenta ejecutar sus instrucciones.
	        // CATCH captura el error, y actua en consecuencia a ese error.
				try {
	        	
				System.out.println("Ingresa un numero para dividir: ");
	    		float numerador = entrada.nextFloat();
	    		
	    		if (numerador < 0) {
	                throw new ArithmeticException();
	              // Agregro a ArithmeticException() que, si el numero es negativo, será un error (por eso "throw new").
	            }
	    		System.out.println("Por cuanto lo queres dividir? ");
	    		
	    		
	    		
	            float denominador = entrada.nextFloat();
	            
	            if (denominador < 0) {
	                throw new ArithmeticException();
	             // Agregro a ArithmeticException() que, si el numero es negativo, será un error (por eso "throw new").
	            }
	            
	            if (denominador == 0) {
	            	throw new  ArithmeticException();
	            }
	            
	            float resultado = numerador / denominador;
	            System.out.println("Resultado: " + resultado);
	// Notar que se deben colocar las intrucciones que pueden fallar dentro de TRY.
	           
	        } catch (ArithmeticException e) { 
	            System.out.println("Error: Division por cero o numero negativo.");
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Debes ingresar un dato valido.");
	        } finally { // Finally actua SIEMPRE. No es obligatorio.
	        	System.out.println("Programa finalizado.");
	        }
	        

		}


	}


