package org.example.HW01;

/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
Метод divisionByZero - Деление на 0
Метод numberFormatException - Ошибка преобразования строки в число
Важно: они не должны принимать никаких аргументов
*/


import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        //arrayOutOfBoundsException();
        //divisionByZero();
        numberFormatException();
    }

    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] array = new int[5];
        System.out.println(array[5]);
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 5;
        int b = 0;
        int res = a/b;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String a = "qwer";
        int i  = Integer.parseInt(a);
    }
}
