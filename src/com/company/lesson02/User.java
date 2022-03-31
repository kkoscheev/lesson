package com.company.lesson02;

public class User {
    private int age;
    private String name;
    private String passport;

 /*   public User(int a, String n, String p){
        age = a;
        name = n;
        passport = p;
    }*/

    public User(int age, String name, String passport) {
        this.age = age;
        this.name = name;
        this.passport = passport;
    }

    public User(int age, String name){
        this.age = age;
        this.name = name;
    }

    public User(){

    }

    public  int getAge(){
        return this.age;
    }
    public String getName(){
        return  this.name;
    }
    public void setName(String name){
    this.name = name;
    }
    public void talk(String text){
        System.out.println(text);
    }

    public static void m(){

    }
}
