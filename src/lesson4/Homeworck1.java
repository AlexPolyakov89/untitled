package lesson4;

public class Homeworck1 {
    public static void main(String[] args) {
        char[] mass = {'a', 'b', 'c', 'd','e'};
        int glass = 0;
        for (int i = 0; i < 5; i++) {
            if (mass[i] == 'a' || mass[i] == 'e') {
                glass++;
                System.out.println(glass);
            }
        }
    }
}
