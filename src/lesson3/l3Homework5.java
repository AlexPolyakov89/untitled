package lesson3;

public class l3Homework5 {
    public static void main(String[] args) {
        double cash = 10000;
        double procent = 9;
        double year = 7;


        for (int i =0;i<year;i++){
            cash = cash + (cash / 100 * procent);
        }
        System.out.println(cash);
    }
}



        /*int[] massiv = new int[7];
        int summa = 10000;
        int procent = 10000*9/100;// 900
        for (int i = 0; i < 6; i ++) {
            massiv[i] = summa+procent;
            summa += procent;
            System.out.println(massiv[i]);


        } */

