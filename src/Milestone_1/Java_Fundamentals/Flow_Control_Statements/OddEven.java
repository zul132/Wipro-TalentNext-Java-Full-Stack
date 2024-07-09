package Milestone_1.Java_Fundamentals.Flow_Control_Statements;

import java.util.Scanner;

//Write a program to check if a given integer number is odd or even
public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 2 == 0)
			System.out.print("Even");
		else
			System.out.print("Odd");
	}
}
