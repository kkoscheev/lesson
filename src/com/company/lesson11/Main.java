package com.company.lesson11;

public class Main {
    public static void main(String[] args) {
    User user1 = new User(20, "Dima", "svid");
    System.out.println(user1.toString());
    User user2 = new User(30, "Kostya", "pasp");
    System.out.println(user2.toString());

    System.out.println(user1.equals(user2));
    System.out.println();
    System.out.println();

    }
}
