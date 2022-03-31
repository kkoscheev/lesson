package com.company.lesson11;

public class User extends Object{
    private int age;
    private String name;
    private String passport;

    public User(int age, String name, String passport) {
        this.age = age;
        this.name = name;
        this.passport = passport;
    }
    @Override
    public String toString() {
        return "Hello " + name + age;
//                super.toString();
    }
}
