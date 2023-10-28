package org.example.HW01;

/*
* Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
* и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны - верните нулевой массив длины 1.
Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:

int[] a - первый массив
int[] b - второй массив
Пример

a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3};

Вывод: [3, 3, 3]

a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3, 5};

Вывод: [0]
* */

import java.util.Arrays;

public class task02 {
    public static void main(String[] args) {
        int[] arr = subArrays(new int[]{2, 3, 4, 1, 9}, new int[]{2, 6, 1, 1, 9});
        System.out.print(Arrays.toString(arr));
    }

    public static int[] subArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return new int[]{0};
        } else {
            int[] result = new int[a.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = a[i] - b[i];
            }
            return result;
        }
    }


}
