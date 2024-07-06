package Java_Fundamentals.Arrays;

import java.util.Scanner;

/* Write a program to initialize an integer array and find the maximum and minimum value of the array */

public class Max_Min_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		//Input the array elements
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<n; i++)
		{
			if (max < arr[i])
				max = arr[i];
			
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);	
	}
}
