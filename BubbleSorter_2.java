package com.company;



public class BubbleSorter_2 {
    public static void sort(int[] array) {
        int min = array[0];
        int max = array[0];
        if (array[0]!=0 ){
        for (int y = 1; y < array.length; y++) {
            if (array[y] < min) {
                min = array[y];
            }
            if (array[y] > max) {
                max = array[y];
            }
        }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;}
                    if (array[0] == min & array[array.length - 1] == max) {
                        break;
                    }
                }


            }
        }
    }
