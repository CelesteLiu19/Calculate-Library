
public class Hourglass {
	int size = 10;
	public static void base(int base) {
		System.out.print("|");
		for(int i = 0; i < 10; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void topHalf(int topHalf) {
		for(int i = 0; i < 4; i++) {
			System.out.print(" ");
		}
		for(int j = 0; j < 4; j++) {
			int colon = -2 * j +10;
			System.out.println("\\ + ")
		}
	}
	
}
