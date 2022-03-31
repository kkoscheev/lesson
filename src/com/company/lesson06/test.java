package com.company.lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String s = reader.readLine();
//        System.out.println(s);

//        InputStreamReader streamReader = new InputStreamReader(System.in);
//        System.out.println((char) streamReader.read());

        String str = reader.readLine();
        int num1 = Integer.parseInt(str);

        int num2 = Integer.parseInt(reader.readLine());

        System.out.println(sum(num1,num2));
    }
    private static int sum(int numb,int numb1){
        int res = numb + numb1;
        return res;
    }
}
