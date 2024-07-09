package Milestone_1.Java_Fundamentals.Flow_Control_Statements;
/* 
 	Write a program to accept gender("Male" or "Female") and age from command line arguments and print the percentage of interest 
 	based on the given conditions.
*/

public class percentageInterest {

	public static void main(String[] args) {
		if (args.length >= 2) {
			String gender = args[0];
			int age = Integer.parseInt(args[1]);

			if (gender.equals("Female")) {
				if (age >= 1 && age <= 58)
					System.out.println("8.2%");
				else if (age >= 59 && age <= 100)
					System.out.println("9.2%");
			} else if (gender.equals("Male")) {
				if (age >= 1 && age <= 58)
					System.out.println("8.4%");
				else if (age >= 59 && age <= 100)
					System.out.println("10.5%");
			}
		}
	}
}
