package lesson7;

public class Main {
    public static void main(String[] args) {

        int number1 = Calculator.getint();
        int number2 = Calculator.getint();
        char operator = Calculator.getOperation();
        double result =Calculator.calc(number1, number2, operator);
        System.out.println("Результат "+ result);


    }
}
