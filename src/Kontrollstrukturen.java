public class Kontrollstrukturen {
	
	public static void main(String[] args) {
		// Kontrollstrukturen
		
		int a = 10, b = 9, jahreszeit = 2;
		
		// if-else Abfrage
		if (a > b) {
			System.out.println("a ist größer als b");
		} else if (a < b) {
			System.out.println("a ist kleiner als b");
		} else {
			System.out.println("a ist gleich b");
		}
		
		// switch-case Abfrage
		switch (jahreszeit) {
		case 1:
			System.out.println("Es ist Frühling!");
			break;
		case 2:
			System.out.println("Es ist Sommer!");
			break;
		case 3:
			System.out.println("Es ist Herbst!");
			break;
		case 4:
			System.out.println("Es ist Winter!");
			break;
		}
		
	}

}
