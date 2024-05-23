package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {
	
  Scanner datos = new Scanner(System.in);
  
  int contrasena= 2007 ;
  int intentos = 3;
  boolean contra = false;
  
  do {
	  
	  
	  System.out.println("quedan : "+ intentos);
	   System.out.println("ingrese la contraseña: ");
	  contrasena= datos.nextInt();
	  intentos--;
	  
	

	  }
	  
	  while (contrasena != 2007 && intentos>0 ); {
		  
		  
		  
		  if (contrasena == 2007) {
			  System.out.println("entrando...");
			  
		  }
		  
		  else if (intentos == 0) {
			  System.out.println("no");
			  
		  }
		}  
	  
	  
	  
  }
	  
  
  
    
    
 
   
 
		

    
    

    }

