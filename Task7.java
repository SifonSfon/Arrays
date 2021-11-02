package com.company;

public class Task7 {
    public static void main(String[] args) {
        int array_7[][]=new int[][]{
            {12,43,72,11,69,-2,4,-44},
            {-5, -45, 56, 32,-21,34,56,90},
            {-7, -45, 5, 2,-21,34,56,90},
            {5, 42, 99, 7,21,34,6,90},
            {-5, -45, -90, 32,-21,24,56,0},
        };
        forEach(array_7);
    }

         static void forEach(int[][] array_7) {
            for (int[] c : array_7) {
                for (int d : c) {
                System.out.print(d + "  ");
               }
            System.out.println();
           }

    }
}






