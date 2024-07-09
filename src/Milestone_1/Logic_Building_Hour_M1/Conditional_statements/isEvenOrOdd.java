package Milestone_1.Logic_Building_Hour_M1.Conditional_statements;

//Write a program to accept a number N and print whether the number is EVEN or ODD
import java.util.Scanner;

public class isEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 2 == 0)
			System.out.print("EVEN");
		else
			System.out.print("ODD");
	}
}
