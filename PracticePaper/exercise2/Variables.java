// Program that takes the radius of a circle as input, calculate its area and prints it as a output to the user.

package PracticePaper.exercise2;

import java.util.*;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        double area = Math.PI*r*r;

        System.out.println("Area of the circle: " + area);
    }
}
