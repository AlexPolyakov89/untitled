package lesson5;

import java.util.Scanner;

public class ConsoleUtils {

    // вывести на косоль что либо несколько раз
    public static void printPrivetByNumber() {
        System.out.println("Введите число");
        // пойдет в формулу создания обьекта:
        int[] mass = new int[5];

        Scanner scaner = new Scanner(System.in);
        int inputNumber = scaner.nextInt();
        for (int i = 0; i < inputNumber; i++) {
            System.out.println("privet");
        }


    }
}
