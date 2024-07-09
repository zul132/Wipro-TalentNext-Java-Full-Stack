package Milestone_1.Java_Fundamentals.Language_Basics;

//Program that accepts a String as a command line argument and print a Welcome message

public class welcomeMessageArguments {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Welcome " + args[0]);
        }
    }
}
