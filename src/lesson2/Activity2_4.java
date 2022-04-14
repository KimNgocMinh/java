package lesson2;
import java.util.Scanner;
    public class Activity2_4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number(n): ");
            int number = input.nextInt();
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("sum = 1 + 2 +...+n = " + sum);
            float avg = (float) sum/number;
            System.out.print("avg = " + avg);
        }
    }