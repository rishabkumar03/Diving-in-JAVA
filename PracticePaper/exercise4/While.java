/*
Design a menu driven program. The user can enter 2 numbers, either 1 or 0. If the user enters 1 then keep taking input from the user for a student marks (out of 100). If they enter 0 then stop.

If they scores: 
Marks >= 90 -> print "Your performance is quite well among others"
89 >= Marks >= 60 -> print "This is good but try to score more"
59 >= Marks >= 0 -> print "This isnt good, Keep practicing"
 */

package PracticePaper.exercise4;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice, either 1 or 0. ");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter your marks out of 100");
            int marks = sc.nextInt();
            
            if (marks >= 90) {
                System.out.println("Your performance is quite well among others");
            } else if (marks <= 89 || marks >= 60){
                System.out.println("This is good but try to score more");
            } else if (marks <= 59 || marks >= 0){
                System.out.println("This isnt good, Keep practicing");
            } else {
                System.out.println("You are entering invalid marks");
            }
        } else {
            System.out.println("I dont need any data from you. \nHope you have a good day.");
        }
    }
}
