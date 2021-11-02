package com.company;/*Создать двумерный массив 5х8 типа int
                         и инициализировать его с помощью блока для инициализации.
                             Найти максимальное и минимальное значение в каждой "строке"
                                 и записать эти значения в двухмерный массив 5х2.
                                      Распечатать оба массива.*/

public class Task6 {
    public static void main(String[] args) {

        int[][] array_6=new int[][]{
                {12,43,72,11,69,-2,4,-44},
                {-5, -45, 56, 32,-21,34,56,90},
                {-7, -45, 5, 2,-21,34,56,90},
                {5, 42, 99, 7,21,34,6,90},
                {-5, -45, -90, 32,-21,24,56,0},
        };
        for (int j = 0; j < array_6.length; j++){
            for(int i = 0; i < array_6[j].length; i++){
                System.out.print(array_6[j][i] +"  ");
            }
            System.out.println();
        }
        int min_max[][] = new int[5][2];
        for (int j = 0; j < array_6.length; j++ ) {

            int temp = array_6[j][0];
            int temp_2=array_6[j][0];

            for (int i = 1; i < array_6[j].length; i++) {

                if( array_6[j][i] < temp){
                     temp=array_6[j][i];}
                     if (array_6[j][i]> temp_2){
                         temp_2=array_6[j][i];
                     }
            }
            min_max[j][0] = temp;
            min_max[j][1] = temp_2;
            System.out.print(min_max[j][0] + " ");
            System.out.print(min_max[j][1]);
            System.out.println();


        }




    }


}




