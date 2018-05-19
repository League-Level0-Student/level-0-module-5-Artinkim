
public class fibonacci {
	public static void main(String[] args) {
		int n = 0;
		int n2 = 1 + n;
		int n3 = n + n2;
		for (int i = 0; i < 4; i++) {
			System.out.println(n = n2 + n3);
			System.out.println(n2 = n + n3);
			System.out.println(n3 = n + n2);
		}

	}

}
