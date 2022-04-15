package lesson2;
import java.util.Scanner;
    public class Activity3_1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter fibonacci length: ");
            int length = input.nextInt();
            int num1 = 0;
            int num2 = 1;
            int num3 = 0;
            for (int i = 1; i <= length; i++){
                num1 = num2;
                num2 = num3;
                num3 = num1 +num2;
                if (i == length) System.out.print(num3 + " . ");
                else System.out.print(num3 + " , ");
            }
        }
}
