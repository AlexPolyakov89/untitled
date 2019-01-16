package lesson2;

public class Homework3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 6;
        // р- перриметр
        double p = (a + b + c) / 2;
        // h- высота треугольника, кот. опускаю на сторону а
        // решил разбить общую формулу высоты на несколько частей
        double h1 = p * (p - a) * (p - b) * (p - c);
        double h2 = Math.sqrt(h1);
        double h = (2 * h2) / a;
        // s- площадь треугольника
        double s = (a * h) / 2;
        System.out.println(s);


    }
}
