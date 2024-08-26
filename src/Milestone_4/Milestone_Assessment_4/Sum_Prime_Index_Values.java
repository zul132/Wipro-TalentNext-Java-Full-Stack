package Milestone_4.Milestone_Assessment_4;

import java.util.Scanner;
/*
    Program to compute the sum of prime index values in an Array. 
    For reference, some of the first primes are: 2, 3, 5, 7, 11, 17, 19, 23, 29...

    EXAMPLES:
    Sample Input 0:
    n = 10
    arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
    Sample Output 0:
    prime index values are 30, 40, 60, 80, so their sum = 210.

    Sample Input 1:
    n = 6
    arr = {-1, -2, -3, 3, -4, -7}
    Sample Output 1:
    prime index values are -3, 3, -7, so their sum = -7.

    Sample Input 2:
    n = 2
    arr = {-1, -2}
    Sample Output 2:
    There are no prime indices, so sum = 0.
    
*/

public class Sum_Prime_Index_Values {
    static int sumPrimeIndices(int input1[], int input2) {
        int sum = 0;

        // since prime indices must be > 1, start checking from 2nd index
        for (int i = 2; i < input2; i++)
            if (isPrime(i))
                sum += input1[i];

        return sum;
    }

    // helper function to check if the index is prime or not
    static boolean isPrime(int n) {
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i < n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of input array

        // get the input array
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int result = sumPrimeIndices(arr, n);
        System.out.println("Sum of prime index values are " + result);

    }

}
