import java.util.*;
import java.lang.Math;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // *************armstrong number
        System.out.println("enter the number");
        int number = sc.nextInt();
        int m = number, count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        number = m;
        int sum = 0, rem;
        while (number > 0) {
            rem = number % 10;
            sum = (int) Math.pow(rem, count) + sum;
            number = number / 10;
        }
        if (sum == m) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong number");
        }
    }
}