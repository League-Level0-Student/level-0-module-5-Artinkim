/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	public static void main(String[] args) {
		
	

		// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.
String pi = "3.14159265";
		// 3. Print out the first 3 digits of Pi to the console.
	System.out.println(pi.charAt(0)); 
	System.out.println(pi.charAt(1)); 
	

		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.

			for(int i = 2;i< pi.length();i++)
			{
			String g = JOptionPane.showInputDialog("What is the next digit of pi");
			
			if(pi.charAt(i)==(g.charAt(0)))
			{
			JOptionPane.showMessageDialog(null, "Correct");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Incorrect start over");
				break;
			}
			}

				// 5. Ask the user for the NEXT digit of pi.

				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 

					// 7. If they are correct, print out "correct".

					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.

}
}

