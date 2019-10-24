public class Schleifen {

	public static void main(String[] args) {
		// Schleifen
		
		int i = 0;
		
		// while Schleife
		while (i < 10) {
			System.out.println(i);
			i++;  // erhöhe i um 1
		}
		
		
		// do-while Schleife
		do {                        // Beachte: i wurde in der oberen Schleife schon auf 10 erhöht
			System.out.println(i);  // trotzdem wird der Code in dieser Schleife einmal ausgeführt!
			i++;  // erhöhe a um 1
		} while (i < 10);
		
		
		// for Schleife
		for (i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

}
