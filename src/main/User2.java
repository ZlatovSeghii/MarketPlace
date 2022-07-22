package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User2 extends Users {
    private int amountOfMoney;

    public User2(int id, String name, String lastName, int amountOfMoney) {
        super(id, name, lastName);
        this.amountOfMoney = amountOfMoney;
    }

    static List<Products> buyedProductsByUser2 = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void purchase() {
        System.out.println("Enter product id: ");
        int productId = scanner.nextInt();
        if (productId == Products.products1.getId() && user2.amountOfMoney >= Products.products1.getPrice()) {
            user2.amountOfMoney -= Products.products1.getPrice();
            System.out.println("Purchase is successful!");
            buyedProductsByUser2.add(Products.products1);
            pantsCustomers.add(user2);
        } else if (productId == Products.products2.getId() && user2.amountOfMoney >= Products.products2.getPrice()) {
            user2.amountOfMoney -= Products.products2.getPrice();
            System.out.println("Purchase is successful!");
            buyedProductsByUser2.add(Products.products2);
            shoesCustomers.add(user2);
        } else if (productId == Products.products3.getId() && user2.amountOfMoney >= Products.products3.getPrice()) {
            user2.amountOfMoney -= Products.products3.getPrice();
            System.out.println("Purchase is successful!");
            buyedProductsByUser2.add(Products.products3);
            tshirtCustomers.add(user2);
        } else if (user2.amountOfMoney < Products.products1.getPrice()
                || user2.amountOfMoney < Products.products2.getPrice()
                || user2.amountOfMoney < Products.products3.getPrice()) {
            System.out.println("You don't have enough money to buy product");
        } else {
            System.out.println("Please enter right command");
        }
    }

    public static void showPurchasedProducts2() {
        for (Products buyedProduct : buyedProductsByUser2) {
            System.out.println(buyedProduct);
        }
    }

    public String toString() {
        return "User id: " + this.getId() +
                ", user name: " + this.getName() +
                ", user last name: " + this.getLastName() +
                ", user amount of money: " + amountOfMoney+".";
    }
}
