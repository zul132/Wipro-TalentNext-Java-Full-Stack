package Milestone_1.Java_Fundamentals.Flow_Control_Statements;
import java.util.Scanner;

/* Write a program to receive a colour code from the user, and then print the respective colour name.
 * Following are the colour codes and their corresponding colour names.
 * R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. */

public class colourCode {
	
	public static void printColourName(char code)
	{
		switch(code)
		{
			case 'R': 
				System.out.println("Red");
				break;
			case 'B': 
				System.out.println("Blue");
				break;
			case 'G':
				System.out.println("Green");
				break;
			case 'O':
				System.out.println("Orange");
				break;
			case 'Y':
				System.out.println("Yellow");
				break;
			case 'W':
				System.out.println("White");
				break;
			default:
				System.out.println("Invalid Code");
				break;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c1 = sc.next().charAt(0);
		printColourName(c1);
		char c2 = sc.next().charAt(0);
		printColourName(c2);
		char c3 = sc.next().charAt(0);
		printColourName(c3);
	}
}
