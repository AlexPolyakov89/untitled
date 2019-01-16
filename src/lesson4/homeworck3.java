package lesson4;

public class homeworck3 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 3, 9};
        int[] arr2 = new int[5];
        arr2[4] = arr[0];
        for (int i = 0; i < 4; i++) {
            arr2[i] = arr[i+1];

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i]);
        }


    }
}
