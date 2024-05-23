package ejercicio21;+

public class ejercicio21 {

	public static void main(String[] args) throws InterruptedException {
		
		int i=35;
		
		while (i<=100) {
			System.out.println("temperatura "+i+"°");
			Thread.sleep(20);
		     i+= 2;	
		 
			if (i==85) {
				System.err.println("CUIDADO!, TEMPERATURA PELIGROSA");
				Thread.sleep(1000);
				
			}
			if (i==101) {
				System.err.println("VALOR EXTREMO");
				System.err.println("APAGANDO\r\n PC.");
				Thread.sleep(1000);
			}
		}

	}

}
