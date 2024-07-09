package Milestone_1.Java_Fundamentals.Flow_Control_Statements;

//Write a program to check if the program has received command line arguments or not
public class hasArguments {

	public static void main(String[] args) {
		if (args.length > 0) {
			for (int i = 0; i < args.length - 1; i++) {
				System.out.print(args[i]);
				System.out.print(",");
			}
			System.out.print(args[args.length - 1]);
		} else {
			System.out.print("No Values");
		}

	}

}
