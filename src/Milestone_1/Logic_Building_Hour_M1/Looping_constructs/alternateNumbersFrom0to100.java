package Milestone_1.Logic_Building_Hour_M1.Looping_constructs;

//Write a program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100

public class alternateNumbersFrom0to100 {
	public static void main(String[] args) {
		for(int i = 0; i<=100; i+=2)
		{
			System.out.print(i + " ");
		}
	}
}
