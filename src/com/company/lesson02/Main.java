package com.company.lesson02;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(30, "Kostya", "pasp");
/*        User.age = 25;
        user1.name = "Alex";
        user1.passport = "124235";*/

        User user2 = new User(20, "Dima", "svid");
        User user3 = new User(25, "Sonya");
        User user4 = new User();

        user2.setName("DimaK");

        user1.talk( "textnew");
        User.m();
        System.out.println(user1.getName());
        System.out.println(user1.getAge());
        System.out.println(user2.getName());
        System.out.println(user2.getAge());
        System.out.println(user3.getName());
        System.out.println(user3.getAge());
        System.out.println(user4.getName());
        System.out.println(user4.getAge());
    }
}
