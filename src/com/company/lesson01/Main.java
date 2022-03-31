package com.company.lesson01;

public class Main {

    public static void main(String[] args) {
//      byte- 2/8  int- 2/32
        int num = 20;
        int num1 = 30;
        byte ba = 127;
        char ch = 'w';
        float fl = 12.34F;
        long l = 123456789L;
        System.out.println(fl );
        fl = 123.43F;
        String str = "23";
        System.out.println(fl );
        int res = sum(num,num1);
        System.out.println(res);

    }
    private static int sum(int numb,int numb1){
        int res = numb + numb1;
        return res;
    }
}
