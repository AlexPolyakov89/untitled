package lesson4;

public class homeworck4 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int x = 4;
        arr[0] = x;
        arr[1] = x;
        x = x + 4;
        arr[2] = x;
        for (int i = 0;i<7 ;i++) {
            arr[i] = x;
            x = x + 4;
            System.out.println(arr[i]);

        }

    }
}
