import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Give me a number");
		int n2 = Integer.parseInt(n);
		for (int i = 2; i < n2; i++) {
			if (n2 % i == 0) {
				JOptionPane.showMessageDialog(null, "It is not a prime number");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "It is a prime number");
	}
}
