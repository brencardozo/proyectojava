package ejercicio20;

public class ejercicio20 {

	public static void main(String[] args) throws InterruptedException {

		int i = 1;

		while (i <= 100) {
			System.out.println(i);
			i++;

			Thread.sleep(20);

		}

		System.err.println("LLegaste a los 100 seguidores!!");

	}

}
