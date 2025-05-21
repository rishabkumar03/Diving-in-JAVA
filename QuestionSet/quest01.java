// Enter 3 numbers from the user & make a function to print their average.

import  java.util.*;

public class quest01 {

    public static int printAverage(int x, int y, int z) {
        System.out.print("Average is: " + (x+y+z)/3.0);
        return (x+y+z)/3;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x,y and z to print their average");

        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y : ");
        int y = sc.nextInt();
        System.out.print("Enter the value of z : ");
        int z = sc.nextInt();

        printAverage(x, y, z);
    }
}
