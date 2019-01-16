package lesson7;

import java.util.Scanner;

public class Calculator {

    public static int getint() {
        System.out.println("Введите число");

        Scanner scaner = new Scanner(System.in);

        String inputNumber = scaner.nextLine();

        char[] inputNumbersTooChars = inputNumber.toCharArray();

        for (int i = 0; i < inputNumbersTooChars.length; i++) {
            char currentChar = inputNumbersTooChars[i];
            if (currentChar != '0' && currentChar != '1' && currentChar != '2'
                    && currentChar != '3' && currentChar!='4'&& currentChar!='5'
                    && currentChar!='6'&&currentChar !='7'&&currentChar!='8'&&currentChar!='9') {
                System.out.println("Это не число, повторите ввод");
                return Calculator.getint();// рекурсия- повтор до того момента пока не пройдет условие ИФ

            }
        }

        int number = Integer.parseInt(inputNumber);// преобразовываем в инт после проверки символов

        return number;


    }
    public static char getOperation() {
        System.out.println("Математическое Действие");

        Scanner scaner = new Scanner(System.in);
        String inputOperation = scaner.nextLine();
        char[] inputNumbersTooChars = inputOperation.toCharArray();
        if (inputNumbersTooChars.length > 1) {
            System.out.println("Это не математическое действие, повторите ввод");
            return Calculator.getOperation();
        }// убрали фор потому что у нас 1 знак , а не число любой длинны

            char currentChar = inputNumbersTooChars[0];
            if (currentChar != '/' && currentChar != '*' && currentChar != '+'
                    && currentChar != '-' ){
                System.out.println("Это не математическое действие, повторите ввод");
                return Calculator.getOperation();

            }

        return currentChar;
    }

    public static double calc(int number1 , int number2, char operator) {
        if (operator == '*') {
            return number1 * number2;
        }
        if (operator == '/') {
            return number1 / number2;
        }
        if (operator == '+') {
            return number1 + number2;
        }
        return number1 - number2;
    }

}
