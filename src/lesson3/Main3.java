package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int[] massiv = new int[7];

        // индекс
        int index = 0;
        // значение
        int value = 7;
        for ( int i = 0 ; i < 7; i ++){
            massiv[index] = value;
            index++;
            value--;
        }

     //    massiv[0] = 7;
     //    massiv[1] = 6;
     //    massiv[2] = 5;
     //    massiv[3] = 4;
     //    massiv[4] = 3;
     //    massiv[5] = 2;
     //    massiv[6] = 1;

        for ( int i = 0; i < 7; i ++){
            System.out.println(massiv[i]);
        }


    }
}
