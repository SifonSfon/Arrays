package com.company;/* Если это называется гирлянда, то это то самое задание прогирлянду*/

public class Task_8 {
    public static void main(String[] args) {
        int f[][]=new int[][]{
                {12,43,72,11,69,-2,4,-44},
            {-5, -45, 56, 32,-21,34,56,90},
            {-7, -45, 5, 2,-21,34,56,90},
            {5, 42, 99, 7,21,34,6,90},
            {-5, -45, -90, 32,-21,24,56,0},};

        Blink(f);
    }
        static void Blink(int[][]f){
        for(int[] d : f){
            for (int a : d){
            a<<=1;
                System.out.print(Integer.toBinaryString(a)+ " ");
            };
            System.out.println();
        }

        }


}
