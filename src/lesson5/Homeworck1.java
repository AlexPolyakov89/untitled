package lesson5;

public class Homeworck1 {
    public static double plosadChisel (double chislo1 ,double chislo2,double chislo3) {
        double p = (chislo1 + chislo2 + chislo3) / 2;
        double h1 = p * (p - chislo1) * (p - chislo2) * (p - chislo3);
        double h2 = Math.sqrt(h1);
        double h= (2 * h2) / chislo1;
        double s = (chislo1 * h) / 2;
        return s;


    }
    public static void massivChisel (int chislo4,int chislo5,int chislo6,int chislo7,int chislo8) {     // 5 чисел
        int[] massiv = {chislo4,chislo5,chislo6,chislo7,chislo8};
        for (int i = 0; i < 5; i++) {
            if (massiv[i] % 2 == 0) {
                System.out.println(massiv[i]);

            }

        }




    }



}
