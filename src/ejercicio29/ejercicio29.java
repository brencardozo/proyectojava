package ejercicio29;

public class ejercicio29 {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 100; i >= 1; i--) {
			Thread.sleep(20);
			System.out.println(i + "%");
			if(i==20) {
				Thread.sleep(1000);
				System.out.println("Bateria baja");	
			}
			if(i==1) {
				System.out.println("apagando...");
			}
			
		}

	}

}
