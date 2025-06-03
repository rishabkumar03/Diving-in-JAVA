// Find the maximum and minimum number in an array of integers 

package PracticePaper.exercise8;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        int size = sc.nextInt();        
        int numbers[] = new int[size];
        System.out.println("Enter " + size + " integers:");

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }

            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println("Minimum integer in the array is : " + min);
        
        System.out.println("Maximum integer in the array is : " + max);
    }
}
