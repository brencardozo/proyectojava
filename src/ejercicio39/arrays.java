package ejercicio39;

import java.util.Scanner;

public class arrays {
  
	public static void main(String[] args) {
		 
		Scanner datos = new Scanner(System.in);
		
		mes mesEnum;
		String ingresoDatos;
		
		System.out.println("Ingrese un mes: ");
		ingresoDatos=datos.nextLine().toUpperCase();
		
		mesEnum  =mes.valueOf( ingresoDatos);
			
		switch (mesEnum) {
		
		case FEBRERO:
			
			System.out.println("Tiene 28 días.");
			
			break;
			
		case ABRIL:
		case JUNIO:		
		case SEPTIEMBRE:
		case NOVIEMBRE:
			
			System.out.println("Tienen 30 días.");
			
		break;
		
		case ENERO:
		case MARZO:
		case MAYO:
		case JULIO:			
		case AGOSTO:
		case OCTUBRE:
		case DICIEMBRE:
			
		System.out.println("Tienen 31 días.");
		break;
		
		}
				
			}
		
	}


