package ejercicio29;

public class ejercicio28 {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 100; i >= 0; i--) {
			Thread.sleep(20);
			System.out.println(i + "%");
		}

	}

}
