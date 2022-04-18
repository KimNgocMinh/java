package lesson3;
import java.util.Scanner;

public class Activity3_3 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter number of electric consumption: ");
     int number = input.nextInt();
     //
        double rank2 = 50 * 1388;
        double rank3 = 50 * 1433;
        double rank4 = 100 * 1660;
        double rank5 = 100 * 2082;
        double rank6 = 100 * 2324;
        if (number <= 50)
            System.out.println("electric bill: " + (number * 1388));
        else if (number <= 100)
            System.out.println("electric bill: " + ((number - 50) * 1433 + rank2));
        else if (number <= 200)
            System.out.println("electric bill: " + ((number - 100) * 1660 + rank2 + rank3));
        else if (number <= 300)
            System.out.println("electric bill: " + ((number - 200) * 2082 + rank2 + rank3 + rank4));
        else if (number <= 400)
            System.out.println("electric bill: " + ((number - 300) * 2324 + rank2 + rank3 + rank4 + rank5));
        else
            System.out.println("electric bill: " + ((number - 400) * 2399 + rank2 + rank3 + rank4 + rank5 + rank6));
    }
}
