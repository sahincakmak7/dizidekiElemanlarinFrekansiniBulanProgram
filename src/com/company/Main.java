package com.company;

public class Main {

    static boolean isFind(int[] array, int value) {
        for (int i : array) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] repeat = new int[array.length];
        int counter = 0, index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((array[i] == array[j])) {
                    counter++;
                }

            }
            if (isFind(repeat, array[i]) == false) {
                repeat[index++] = array[i];
                System.out.println(array[i] + " sayısı " + counter + " kere tekrar etti.");
            }
            counter = 0;

        }
    }
}