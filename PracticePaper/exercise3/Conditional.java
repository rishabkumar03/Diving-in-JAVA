// Make a calculator that take 2 numbers (a & b) from the user and follows operation of addition, subtraction, multiplication, division and modulo. Calculate the result according to the operation given and display it to the user.

package PracticePaper.exercise3;

import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: \n1. Addition \n2. Subtraction \n3. Multiplication \4. Division \n5. Modulo");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.println("Addition: " + (a + b));
        } else if (op == 2) {
            System.out.println("Subtraction: " + (a - b));
        } else if (op == 3) {
            System.out.println("Multiplication: " + (a * b));
        } else if (op == 4) {
            if (b != 0) {
                System.out.println("Division: " + (a / b));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else if (op == 5) {
            if (b != 0) {
                System.out.println("Modulo: " + (a % b));
            } else {
                System.out.println("Error: Modulo by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid Choice, You are entering wrong number");
        }
        sc.close();
    }
}
