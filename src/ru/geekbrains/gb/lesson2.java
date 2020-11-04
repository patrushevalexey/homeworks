package ru.geekbrains.gb;

import java.util.Arrays;

public class lesson2 {

    public static void main(String[] args) {
        changeZeroAndOne();
        listWithStepPlusThree();
        listEntityMultiplyTwo();
        changeDiagonal();
    }

    static void changeZeroAndOne() {
        System.out.println("Задание №1");
        int[] listZeroAndOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i;
        for (i=0; i< listZeroAndOne.length; i++){
            listZeroAndOne[i] = 1 - listZeroAndOne[i];
        }
        System.out.println(Arrays.toString(listZeroAndOne));
        System.out.println();
    }

    static void listWithStepPlusThree() {
        System.out.println("Задание №2");
        int[] listPlusThree = new int[8];
        int i;
        for (i=0; i< listPlusThree.length; i++){
            listPlusThree[i] = i*3;
        }
        System.out.println(Arrays.toString(listPlusThree));
        System.out.println();
    }

    static void listEntityMultiplyTwo() {
        System.out.println("Задание №3");
        int[] entityMultiplyTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i;
        for (i=0; i< entityMultiplyTwo.length; i++){
            if (entityMultiplyTwo[i]<6){
                entityMultiplyTwo[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(entityMultiplyTwo));
        System.out.println();
    }

    static void changeDiagonal() {
        System.out.println("Задание №4");
        int[][] listDoubleDiagonal = new int[10][10];
        int i;
        for (i=0; i< listDoubleDiagonal.length; i++){
            listDoubleDiagonal[i][i] = 1;
            listDoubleDiagonal[i][listDoubleDiagonal.length - 1 - i] = 1;
            System.out.println(Arrays.toString(listDoubleDiagonal[i]));
        }
        System.out.println();
    }

    }