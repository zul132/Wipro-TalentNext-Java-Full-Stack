package Milestone_1.Java_Fundamentals.Arrays;

import java.util.Scanner;
/* Write a program to find the largest 2 numbers and the smallest 2 numbers in a given array. */

public class Largest_2_Smallest_2_Numbers {
	public static void largestSmallest2(int[] arr, int n)
	{
		int max = -1, nxtMax = -1;
		int min = 9999, nxtMin = 9999;
		
		for(int i=0; i<n; i++)
		{
			if (arr[i] > max) 
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		
		for(int i=0; i<n; i++)
		{
			if (arr[i] > nxtMax && arr[i] != max) 
				nxtMax = arr[i];
			if (arr[i] < nxtMin && arr[i] != min)
				nxtMin = arr[i];
		}
		System.out.println("Largest 2 numbers: " + max + " " + nxtMax);
		System.out.println("Smallest 2 numbers: " + min + " " + nxtMin);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		largestSmallest2(arr,n);
		
	}
}
