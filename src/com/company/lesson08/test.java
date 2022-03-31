package com.company.lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
/*        for (int i = 2; i <= 10; i += 2) {
            if (i <= 3) {
                System.out.println("litle");
            } else if (i <= 7) {
                System.out.println("good");
            } else {
                System.out.println("much");
            }
        }*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        while (!str.equals("exit")){
            System.out.println(str);
            str = reader.readLine();
//            break; continue;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("cool");
        }
    }
}
