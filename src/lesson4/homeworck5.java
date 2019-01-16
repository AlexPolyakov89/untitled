package lesson4;

public class homeworck5 {
    public static void main(String[] args) {
        int znam1 = 3;
        int znam2 = 9;

        for (int i = 0; i < znam1 * znam2; i++) {
            if (i % znam1 == 0 && i % znam2 == 0) {
                System.out.println(i);
            }

        }
    }
}
