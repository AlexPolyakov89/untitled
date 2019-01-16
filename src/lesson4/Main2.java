package lesson4;

public class Main2 {
    public static void main(String[] args) {
        int i =0;
        while (i < 10) {
            if (i != 3 && i != 4 && i != 5) { // if (i < 3 || i > 5);
                System.out.println(i);
            }
            i++;
        }
    }
}
