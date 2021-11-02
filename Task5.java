package com.company;/* Тут начал делать задание,
                          но меня куда то понесло и я сделал сортировку массива выбором по строкам
                              также тут имеется ошибка которую я так и не нашел,
                                а всё, нашел через три дня:)*/

public class Task5 {
    public static void main(String[] args) {

       int[][] array_5=new int[][]{
                                   {12,43,72,11,69,-2,4,-44},
                                   {-5, -45, 56, 32,-21,34,56,90},
                                   {-7, -45, 5, 2,-21,34,56,90},
                                   {-5, -42, 99, 7,-21,-34,-6,90},
                                   {-5, -45, -90, 32,-21,24,56,0},
       };

            for(int y=0; y < array_5.length; y++) {

                for (int j = 0; j < array_5[y].length; j++) {
                    int pos = j;
                    int min = array_5[y][j];

                    for (int i = j + 1; i < array_5[y].length; i++) {

                        if (array_5[y][i] < min) {
                            min = array_5[y][i];
                            pos = i;
                        }

                    }
                    array_5[y][pos] = array_5[y][j];
                    array_5[y][j] = min;

                    System.out.print(array_5[y][j]+"  ");

                }

                System.out.println();

            }


    }
}
