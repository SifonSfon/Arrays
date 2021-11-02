package com.company;/*Создать массив типа String с размером 7.
                        Записать в него значения дней недели.
                          Вывести на консоль значение последнего элемента.*/

public class Task1 {

    public static void main(String[] args) {

        String[]Days=new String[7] ;

        Days[0] = "Понедельник";
        Days[1] = "Вторник";
        Days[2] = "Среда";
        Days[3] = "Четверг";
        Days[4] = "Пятница";
        Days[5] = "Суббота";
        Days[6] = "Воскресенье";

        System.out.print(Days[Days.length-1]);
    }
}
