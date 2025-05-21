// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;

public class quest05 {
    public static void eligibleAge(int Age) {
        if (Age > 18) {
            System.out.println("Person of age " + Age + " is eligible to vote");
        } else {
            System.out.println("This person is not eliginle to vote");
        }
        return;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age to know if that person is eligible to vote or not: ");
        int Age = sc.nextInt();

        eligibleAge(Age);
    }
}
