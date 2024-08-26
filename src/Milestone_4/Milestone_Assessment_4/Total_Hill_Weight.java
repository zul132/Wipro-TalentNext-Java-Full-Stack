package Milestone_4.Milestone_Assessment_4;

import java.util.Scanner;

/*
    the function totalHillWeight takes 3 inputs:-
    input1 -> denotes Total no of Levels/rows in the Hill pattern = N
    input2 -> weight of the first head Level (First row)
    input3 -> weight increments of each subsequent row

    The Hill Pattern starts from 1 to N and always follows the below format
    *   --> level 1
    *#*
    *#*#*
    *#*#*#*
    *#*#*#*#*
    *#*#*#*#*#* --> level 6
    ...    
    and so on till level N

    Note 1: one extra star '*' is added to each row starting from level 1, while hash '#' is added from level 2 onwards.
            => each row 'Ri' has exactly 'i' stars and 'i-1' hashes.  

    EXAMPLES:
    Sample Input 0:
    No of rows/levels = 5 (input1)
    Weight of head row = 10 (input 2)
    Weight increments = 2 (input3)

    Sample Output 0:
    totalHillWeight = 10 + (12 + 10 + 12) + (14 + 12 + 14 + 12 + 14) + (16 + 14 + 16 + 14 + 16 + 14 + 16) 
                        + (18 + 16 + 18 + 16 + 18 + 16 + 18 + 16 + 18) = 370


    Note 2: Weight of star '*' for first row is input2 (10), and for each subsequent row weight of star '*' is incremented by input3
            (so here, weight of star in 2nd row is increased by 2 to get 12, weight of star in 3rd row is 14, in 4th row it is 16...)

    Note 3: Weight of hash '#' in each row is equal to the weight of star '*' in the previous row.


    Sample Input 1:
    No of rows/levels = 4 (input1)
    Weight of head row = 1 (input 2)
    Weight increments = 5 (input3)

    Sample Output 1:
    totalHillWeight = 1 + (6 + 1 + 6) + (11 + 6 + 11 + 6 + 11) + (16 + 11 + 16 + 11 + 16 + 11 + 16) = 156
*/

public class Total_Hill_Weight {
    static int totalHillWeight(int input1, int input2, int input3) {
        // for the First row/level
        int totalWeight = input2;
        int weightStar = input2;
        int weightHash;

        // For subsequent rows
        for (int i = 2; i <= input1; i++) {
            // Weight of Hash in this row = weight of star in the Prev row
            weightHash = weightStar;
            // Increment weight of star by input3
            weightStar += input3;

            // add the Weight of Current row to total weight
            // each row has 'i' stars and 'i-1' hashes
            totalWeight = totalWeight + (weightStar * i) + (weightHash * (i - 1));
        }

        return totalWeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfRows = sc.nextInt();
        int weightOfHead = sc.nextInt();
        int weightIncrement = sc.nextInt();

        int result = totalHillWeight(noOfRows, weightOfHead, weightIncrement);
        System.out.println("Total weight of Hill pattern is " + result);

    }

}
