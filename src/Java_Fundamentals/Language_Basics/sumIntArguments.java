package Java_Fundamentals.Language_Basics;

//Program tp accept two integers as command line arguments and print the sum of the two numbers

public class sumIntArguments 
{
    public static void main(String[] args)
    {
        if (args.length >= 2) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        } else {
            System.out.println("Please provide two integers as command line arguments.");
        }
    }
}
