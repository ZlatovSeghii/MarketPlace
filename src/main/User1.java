package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User1 extends Users {
    private int amountOfMoney;

    public User1(int id, String name, String lastName, int amountOfMoney) {
        super(id, name, lastName);
        this.amountOfMoney = amountOfMoney;
    }

    static List<Products> buyedProductsByUser1 = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void purchase() {
        System.out.println("Enter product id: ");
        int productId = scanner.nextInt();
        if (productId == Products.products1.getId() && user1.amountOfMoney >= Products.products1.getPrice()) {
            user1.amountOfMoney -= Products.products1.getPrice();
            System.out.println("Purchase is successful !");
            buyedProductsByUser1.add(Products.products1);
            pantsCustomers.add(user1);
        } else if (productId == Products.products2.getId() && user1.amountOfMoney >= Products.products2.getPrice()) {
            user1.amountOfMoney -= Products.products2.getPrice();
            System.out.println("Purchase is successful !");
            buyedProductsByUser1.add(Products.products2);
            shoesCustomers.add(user1);
        } else if (productId == Products.products3.getId() && user1.amountOfMoney >= Products.products3.getPrice()) {
            user1.amountOfMoney -= Products.products3.getPrice();
            System.out.println("Purchase is successful !");
            buyedProductsByUser1.add(Products.products3);
            tshirtCustomers.add(user1);
        } else if (user1.amountOfMoney < Products.products1.getPrice()
                || user1.amountOfMoney < Products.products2.getPrice()
                || user1.amountOfMoney < Products.products3.getPrice()) {
            System.out.println("You don't have enough money to buy product");
        } else {
            System.out.println("Please, enter right command!");
        }
    }


    public static void showPurchasedProducts1() {
        for (Products buyedProduct : buyedProductsByUser1) {
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
