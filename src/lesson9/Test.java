package lesson9;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserManagement userManagement = new UserManagement();
        int command = 0;
        do {
            try {
                System.out.println("-------------------");
                System.out.println("Enter the command: " + "\r\n" +
                        "1. New create." + "\r\n" +
                        "2. Login." + "\r\n" +
                        "3.Find the user's infomation." + "\r\n" +
                        "4.Logout.");
                command = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Command must be integer (from 1 to 4).Please re-enter.");
                input.nextLine();
            }
            switch (command){
                case 1: System.out.println("-----User's information-----");
                        System.out.print("ID: "); int id = input.nextInt(); input.nextLine();
                        System.out.print("User's name: "); String userName = input.nextLine();
                        System.out.print("Password: "); String password = input.nextLine();
                        System.out.print("Display name: "); String displayName = input.nextLine();
                        System.out.print("Email: "); String email = input.nextLine();
                        userManagement.addUser(new User(id,userName,password,displayName,email));break;

                case 2:System.out.println("Enter the username: "); String loginUsername = input.nextLine();
                       System.out.println("Enter the password: "); String loginPassword = input.nextLine();
                    if (userManagement.login(loginUsername, loginPassword) != null) {
                        userManagement.login(loginUsername,loginPassword).printInformation();
                        System.out.println("Login successful!");
                    }else System.out.println("User doesn't exist.");break;

                case 3: System.out.println("Enter the username: "); String findUsername = input.nextLine();
                    if (userManagement.findUserByUsername(findUsername) != null) {
                        userManagement.findUserByUsername(findUsername).printInformation();
                    } else System.out.println("User doesn't exist.");break;
            }
        } while (command != 4);


    }
}
