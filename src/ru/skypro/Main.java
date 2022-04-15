package ru.skypro;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("Сумма трат за месяц составила " + sum);

        }
        //Задание 2
        int maxCosts = arr[0];
        int minCosts = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCosts) {
                maxCosts = arr[i];
                System.out.println("Максимальная сумма трат за день составила " + maxCosts + "рублей");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCosts) {
                minCosts = arr[i];
                System.out.println("Минимальная сумма трат за день составила " + minCosts + "рублей");
            }

        }
        // Задание 3
        double average = sum / arr.length + 1;
        System.out.println("Средняя сумма трат за месяц составила " + average + "рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    // Задание 4
    char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    for (char f = reverseFullName.length; f >= 0; f--) {
        if (f == reverseFullName.length - 1) {
            System.out.println(reverseFullName [f]);
        }
    }
}
