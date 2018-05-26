import java.util.Random;

import javax.swing.JOptionPane;

public class skill_practice {
	public static void main(String[] args) {

		skill_practice skills = new skill_practice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		String d =JOptionPane.showInputDialog("How many dimes do you have");
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
int nd = Integer.parseInt(d);
		// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null,"You have " + nd*10 +" cents");
String h =JOptionPane.showInputDialog("How tall are you in inches");
int hi = Integer.parseInt(h);
if(hi<36)
{
JOptionPane.showMessageDialog(null,"Eat your wheaties");	
}


	}

	void skill2() { 
		for(int i = 0;i<=30;i+=3)// Write a loop to print every third number between 1 and 30 to the console
		{
		System.out.println(i);	
		}

	}

	void skill3() { 
	Random rand = new Random();
	int r = rand.nextInt(20);
	int r2 = rand.nextInt(10);
	// Get a random number that is less than 20 and print it to the console

		// Get another random number that is less than 10 and print it to the console
JOptionPane.showMessageDialog(null, "The difference is " +  Math.abs(r-r2));
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction

	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in");
		if(city.equalsIgnoreCase("San Diego")){
			JOptionPane.showMessageDialog(null,"You live in Americ's Finest City");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Move to San Diego");	
		}
		int cars = 3;
		if(cars == 0)
		{
			JOptionPane.showMessageDialog(null,"I bet you use public transportation");		
		}
		
		if(cars == 1)
		{
		JOptionPane.showMessageDialog(null, cars);
		}
		
		if(cars > 1)
		{
			JOptionPane.showMessageDialog(null, (cars*4));	
		}

		// If they answered "San Diego", tell them they live in Americ's Finest City

		// Otherwise, tell them to move to San Diego

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."

		// If there is 1 car, use a pop-up to display the make/model of the car

		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school
String s = JOptionPane.showInputDialog("What is the name of your school");
		JOptionPane.showMessageDialog(null,s+ " is a fantastic school");

	}
}
