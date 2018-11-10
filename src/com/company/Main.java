package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int iterance = 0;

        System.out.print("Enter array length: ");
        double[] array = new double[scanner.nextInt()];
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextDouble();

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);

            if (array[i] == 5) {
                iterance += 1;
            }
        }

        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
        System.out.println("Number of fives = " + iterance);

        for (int i = 0; i < array.length; i++) {            // не получается передать массив в отдельный метод,
            for (int j = 1; j < array.length; j++) {        // выполнить там сортировку и вернуть его обратно
                if (array[j - 1] > array[j]) {
                    double temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
