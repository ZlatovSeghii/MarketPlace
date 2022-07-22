package main;

import java.util.Scanner;

public class MarketPlace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("\nWelcome to main.MarketPlace!\n" +
                    "Please, enter command:\n" +
                    "1. Show all products \n" +
                    "2. Show all users \n" +
                    "3. Make purchases\n" +
                    "4. Show list of user products by user ID\n" +
                    "5. Show list of users that bought product by product ID\n" +
                    "6. Exit");

            command = scanner.nextLine();
            switch (command) {
                case "1":
                    Products.showAllProducts();
                    break;
                case "2":
                    Users.showAllUsers();
                    break;
                case "3":
                    Users.purchaseProcess();
                    break;
                case "4":
                    Users.showPurchasedProducts();
                    break;
                case "5":
                    Users.showUsersProducts();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Please, enter right command.");
                    break;
            }
        } while (!command.equals("6"));

    }
}
