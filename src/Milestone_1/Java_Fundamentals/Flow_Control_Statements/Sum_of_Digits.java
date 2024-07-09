package Milestone_1.Java_Fundamentals.Flow_Control_Statements;
/* Write a program to print the sum of all digits of a given number */

import java.util.Scanner;

public class Sum_of_Digits {
	public static void sumDigits(int n)
	{
		int q = n;
		int r, sum = 0;
		while ( q != 0)
		{
			r = q % 10;
			sum += r;
			q = q / 10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sumDigits(num);
	}
}
