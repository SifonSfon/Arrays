package com.company;/*Создать двумерный массив типа char размером 4х2.
                         Записать в него значения с помощью блока для инициализации.
                                Распечатать значения массива.*/

public class Task4 {
    public static void main(String[] args) {
        char array_4[][] = new char[4][2];
        char symbol_2 = 'a';
        for (int i=0; i<4; i++){
            for(int j=0; j<2; j++){
            array_4[i][j] = symbol_2;
            symbol_2+=3;
                System.out.print(array_4[i][j]);
            }
            System.out.println();
        }

    }
}
