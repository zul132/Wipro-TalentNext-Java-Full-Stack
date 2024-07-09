package Milestone_1.Logic_Building_Hour_M1.Conditional_statements;

//Write a program to accept two numbers and print the greater value of the two
import java.util.Scanner;

public class greaterOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b)
			System.out.print(a);
		else
			System.out.print(b);
	}

}
