package com.company.lesson10;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 30;

        System.out.println(arr[0]);
        System.out.println(arr.toString());
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
            System.out.print(" ");
        }
        int[][] arra = new int[2][3];
        for (int i = 0; i < arra.length; i++) {
            for (int j = 0; j < arra[i].length; j++) {
                System.out.print(arra[i][j]);
            }
            System.out.println();
        }
    }
}
