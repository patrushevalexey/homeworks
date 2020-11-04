package ru.geekbrains.gb;

public class lesson1 {
    public lesson1() {
    }

    public static void main(String[] args) {
        byte type_byte = 127;
        short type_short = 32767;
        int type_int = 2147483647;
        long type_long = 9223372036854775807L;
        float type_float = 1.1F;
        double type_double = 10.2D;
        char type_char = 'j';
        boolean type_boolean = true;
        computation(2, 3, 10, 5);
        chekingNumbers(7, 2);
        positiveOrNegative(7);
        negativeNumber(-5);
        greeting("Alexey");
        leap(2020);
    }

    private static void computation(int a, int b, int c, int d) {
        System.out.println(a * (b + c / d));
    }

    static void chekingNumbers(int a, int b) {
        if (a + b <= 20 && a + b >= 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Передали положительное число.");
        } else {
            System.out.println("Передали отрицательно число.");
        }

    }

    static void negativeNumber(int a) {
        if (a < 0) {
            System.out.println("true");
        }
    }

    static void greeting(String name) {
        System.out.println("Hey, " + name + "! How are you?");
    }

    static void leap(int year) {
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.println("Год не високосный.");
        } else {
            System.out.println("Год високосный.");
        }
    }
}

