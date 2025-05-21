// Write an infinte loop using do while condition.

import java.util.*;

public class quest06 {
    public static void infiniteLoop(int a){
        do {
            System.out.println(a);
            a++;
        } while (a>0);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's dive in infinite loop by entering a positive number");
        int a = sc.nextInt();

        infiniteLoop(a);
    }
}
