package ejejrcicio36;

import java.util.Scanner;

public class ejercicio36 {

	public static void main(String[] args) {
		
		
		Scanner datos = new Scanner(System.in);
	
		 long ingreso;
		 int mayor = -999999999;
		 int menor = 999999999;
		 int hora = 8;
		 int horamin= 0;
		 int horamax=0;
		 int  suma = 0 ;
		 
		for(int i=8; i <=16; i++) {
	
			System.out.println("ingrese los ingresos:");
			ingreso = datos.nextLong();
			
			suma  =(int) ingreso + suma;
			
			if(ingreso >mayor) {
				
				mayor= (int)ingreso;
				horamax=i;
			}
			if (ingreso<menor) {
				menor = (int)ingreso;
				horamin=i;
		}
		 System.out.println("El  ingreso del dia:" +suma );
		 System.out.println("El ingreso mayor: "+mayor +" pesos, a las "+ horamax+" hs");
		 System.out.println("El ingreso menor: "+menor +" pesos, a las "+ horamin+" hs");
		
		
	}

}
}
