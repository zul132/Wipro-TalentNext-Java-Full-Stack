package Milestone_1.Logic_Building_Hour_M1.Division_Mod_Operations;

/* Write a program to add the last digits of two given numbers. Note: The sign of the input numbers should be ignored.*/ 

public class sumLastDigits {
	public static int addLastDigits(int input1, int input2)
	{
		return (Math.abs(input1) % 10) + (Math.abs(input2) % 10);
	}
	
	public static void main(String[] args) {
		System.out.println(addLastDigits(267,154));  //should return 11
		System.out.println(addLastDigits(267,-154)); //should return 11
		System.out.println(addLastDigits(-267,154));   //should return 11
		System.out.println(addLastDigits(-267,-154));  //should return 11
	}

}
