package lesson3;

import com.sun.deploy.util.ArrayUtil;

public class l3Homework4 {
    public static void main(String[] args) {
        char[] massiv1 = {'a', 'b', 'c', 'd'};
        char[] massiv2 = {'q', 'w', 'e', 'r'};

        char[] massiv3 = new char[8];

        /* for(int i = 0; i<4 ; i++){
           massiv3[i] =massiv1[i];
           massiv3[i+4]=massiv2[i];
           }
           for( int i =0;i<8;i++){
           sout (massiv[i])
         */


        int index = 0;
        for (int i = 0; i <= 3; i++) {
            massiv3[i] = massiv1[index] ;
            index++;
            System.out.println(massiv3[i]);


        }
        int index2 = 0;
        for (int i = 4; i <= 7; i++) {
            massiv3[i] = massiv2[index2];
            index2++;

            System.out.println(massiv3[i]);
        }
    }
}