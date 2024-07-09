package Milestone_1.Java_Fundamentals.Flow_Control_Statements;
/* Write a program to print * in Floyds format. */

public class Floyds_Star_Pattern {

	public static void main(String[] args) {
		if (args.length > 0) {
			int n = Integer.parseInt(args[0]);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++)
					System.out.print("* ");
				System.out.println();
			}
		} else {
			System.out.println("Please enter an integer number");
		}
	}
}
