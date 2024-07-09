package Milestone_1.Java_Fundamentals.Arrays;
/* Write a program to initialize an integer array with values and check if a given number is present in the array or not */

public class Check_if_Number_Present {
	
	public static int find(int arr[], int x)
	{
		for(int i=0; i<arr.length; i++)
			if (arr[i] == x)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = {1,4,34,56,7};
		System.out.println(find(nums,90));	//should print -1
		System.out.println(find(nums,56));	//should print 3
	}

}
