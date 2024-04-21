package org.example;

public class Main {
    public static void main(String[] args) {

        int x = 2;
        int y = 23;
        int z = 15;

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(z));

        int i = 5;
        i = i++;
        System.out.println(i);

        i = 5;
        i = i++ + i++;
        System.out.println(i);

        i = 5;
        i = i++ + ++i;
        System.out.println(i);

        i = 5;
        i = ++i + ++i;
        System.out.println(i);

        System.out.println(Integer.parseInt("101",2));
        System.out.println(Integer.parseInt("11",2));
        System.out.println(Integer.parseInt("111",2));



        System.out.println();


















    }
}