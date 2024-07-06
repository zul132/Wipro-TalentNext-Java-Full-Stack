package Java_Fundamentals.Flow_Control_Statements;

/* Initialize two character variables in a program and display the characters in alphabetical order */

public class printAlphabeticalOrder {
	public static void displayAlphabeticalOrder(char c1, char c2)
	{
		if(c1 < c2)
			System.out.println(c1 + "," + c2);
		else
			System.out.println(c2 + "," + c1);
	}
	
	public static void main(String[] args) {
		//Example 1
		displayAlphabeticalOrder('s','e');
		//Example 2
		displayAlphabeticalOrder('a','e');
	}
}
