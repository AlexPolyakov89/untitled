package lesson3;

public class Main1 {
    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Пуск");

        // цикл от 0 до 20 кратные 3
        for (int i = 0; i <= 20; i = i + 3) {
            if (i != 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }


    }
}
