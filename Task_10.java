package com.company;/*Создать табличку для любого массива,
                        в котором последовательно прописать значения i, j,
                            массива для  каждого цикла алгоритма сортировки пузырька.
                                Используйте debugger. Не понимаю как использовать debugger вне main */
        class BabbleSorterTest {

            public static void main(String[] args) {
                int[][] data = {
                        {0,2,5,3,4},
                };
                for (int[] arr : data) {
                    BabbleSorter.sort(arr);
                }
            }
        }



