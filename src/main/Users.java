package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Users {
    private final int id;
    private final String name;
    private final String lastName;

    static List<Users> usersList = new ArrayList<>();

    static List<Users> tshirtCustomers = new ArrayList<>();
    static List<Users> pantsCustomers = new ArrayList<>();
    static List<Users> shoesCustomers = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public Users(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    static User1 user1 = new User1(1, "Steve", "Rogers", 1000);
    static User2 user2 = new User2(2, "Hermione", " Granger", 500);
    static User3 user3 = new User3(3, "Luke", "Skywalker", 750);

    static {
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
    }

    public static void showAllUsers() {
        for (Users user : usersList) {
            System.out.println(user);
        }
    }

    public static void purchaseProcess() {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("\nPlease, enter the command!\n" +
                    "1. Purchase products \n" +
                    "2. Return to main menu");
            command = scanner.nextLine();
            switch (command) {
                case "1":
                    usersPurchase();
                    break;
                case "2":
                    break;
                default:
                    System.out.println("Please, enter right command.");
                    break;
            }
        } while (!command.equals("2"));
    }


    public static void usersPurchase() {
        System.out.println("Enter user id: ");
        int userId = scanner.nextInt();

        if (userId == user1.getId()) {
            User1.purchase();
        } else if (userId == user2.getId()) {
            User2.purchase();
        } else if (userId == user3.getId()) {
            User3.purchase();
        } else {
            System.out.println("Please, enter right command.");
        }
    }

    public static void showPurchasedProducts() {
        System.out.println("Enter user id: ");
        int userId = scanner.nextInt();
        if (userId == user1.getId()) {
            User1.showPurchasedProducts1();
        } else if (userId == user2.getId()) {
            User2.showPurchasedProducts2();
        } else if (userId == user3.getId()) {
            User3.showPurchasedProducts3();
        } else {
            System.out.println("Please, enter right command.");
        }
    }

    public static void showUsersProducts() {
        System.out.println("Enter product id: ");
        int productId = scanner.nextInt();
        if (productId == Products.products1.getId()) {
            for (Users user : pantsCustomers) {
                System.out.println(user);
            }
        } else if (productId == Products.products2.getId()) {
            for (Users user : shoesCustomers) {
                System.out.println(user);
            }
        } else if (productId == Products.products3.getId()) {
            for (Users user : tshirtCustomers) {
                System.out.println(user);
            }
        } else {
            System.out.println("Please, enter right command.");
        }

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
