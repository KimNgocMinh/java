package lesson2;
import java.util.Scanner;
    public class Activity2_5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();
            int sum = 0;
            for (int i = 1; i <= num2; i++ ){
            sum += num1;
            }
            System.out.print("sum = " + sum);
        }
}
