// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;

public class quest04 {
    public static double circumferenceOfCircle(double r){
        return 2*Math.PI*r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle to find its circumference: ");
        double r = sc.nextDouble();

        double circumference = circumferenceOfCircle(r);
        System.out.println(circumference + " is the circumference of circle");
    }
}
