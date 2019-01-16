package lesson4;

public class Main3 {
    public static void main(String[] args) {
        char[] massiv1 = {'a', 'b', 'c', 'd'};

        char[] massiv2 = new char[4];

        int i = 3;
        while (i >= 0) {
            massiv2[i] = massiv1[i];
            System.out.println(massiv2[i]);
            i--;
        }

    }
}
