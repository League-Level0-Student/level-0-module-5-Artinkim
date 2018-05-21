public class LOOPGAUNTLET {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > 100; i--) {
			System.out.println(i);
		}
		for (int i = 2; i < 100; i += 2) {
			System.out.println(i);
		}
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}
		for (int i = 1; i < 500; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " even");
			} else {
				System.out.println(i + " odd");
			}
		}
		for (int i = 0; i < 778; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 0; i <= 14; i++) {
			System.out.println("In " + (2004 + i) + " I was " + i);
		}
		for (int i = 0; i < 4; i++) {
			for (int g = 0; g < 3; g++) {
				System.out.println(i + " " + g);
			}
		}
		for (int g = 0; g < 3; g++) {
			for (int i = 1; i < 4; i++) {
				System.out.print(i + 3 * g + " ");
			}
			System.out.println();

		}
		for (int g = 0; g < 10; g++) {
			for (int i = 1; i < 11; i++) {
				System.out.print(i + 10 * g + " ");
			}
			System.out.println();

		}
		for (int g = 0; g < 10; g++) {
			for (int i = 0; i < g; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(100 - i);
		}
	}

}
