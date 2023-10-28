package org.example.HW01;


import java.util.Arrays;

/*
* Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
* и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны - верните нулевой массив длины 1.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:

int[] a - первый массив
int[] b - второй массив
Пример

a = new int[]{12, 8, 16};
b = new int[]{4, 2, 4};

Вывод: [3, 4, 4]

a = new int[]{12, 8, 16, 25};
b = new int[]{4, 2, 4};

Вывод: [0]
* */
public class task03 {
    public static void main(String[] args) {
        int[] arr = divArrays(new int[]{2, 3, 4, 1, 9}, new int[]{2, 6, 1, 1, 9});
        System.out.print(Arrays.toString(arr));
    }

    public static int[] divArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return new int[]{0};
        } else {
            int[] result = new int[a.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = a[i] / b[i];
            }
            return result;
        }
    }
}
