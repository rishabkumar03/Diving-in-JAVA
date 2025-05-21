// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeroes entered.

import java.util.*;

public class quest07 {
    public static void displayNumber(){
        Scanner sc =  new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if(number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.println("Want to enter another number? (y/n)");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("results are: ");
        System.out.println("Count of positives: " + positiveCount);
        System.out.println("Count of negatives: " + negativeCount);
        System.out.println("Count of zeroes: " + zeroCount );
    }

    public static void main(String[] args) {
        displayNumber();
    }
}

