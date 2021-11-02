package com.company;/*Изменить программу сортировки пузырьком:
                а) добавить возможность досрочного окончания сортировки;
          б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
       Измените программу так, чтобы минимальный элемент "всплывал" в конец массива
   (внутренний цикл for должен перебирать элементы не с конца, а с начала).
        Не решил проблему с пустой строкой в массиве,
        прога крашится с ошибкой  Index 0 out of bounds for length 0*/

import java.util.Arrays;

  class BubbleSorter_2Test {
      public static void main(String[] args) {
          int[][] data = {

                  {1},
                  {0, 3, 2, 1},
                  {4, 3, 2, 1, 0},
                  {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
          };
          for (int[] arr : data) {
              System.out.print(Arrays.toString(arr) + " => ");
              BubbleSorter_2.sort(arr);
              System.out.println(Arrays.toString(arr));
          }

      }

  }
