// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n 

import java.util.*;

public class quest08 {
    public static double power(int x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To find the desired power of number you want ");

        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();

        double result = power(x, n);
        System.out.println("The result of " + x + "^" + n + " is " + result );

    }
}
