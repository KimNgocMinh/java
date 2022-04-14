package lesson2;
import java.util.Scanner;
    public class Activity2_2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = input.nextInt();
            System.out.print(number + " + " + number * 11 + " + " + number * 111 + " = "
           + (number + number * 11 + number * 111));
        }
}
