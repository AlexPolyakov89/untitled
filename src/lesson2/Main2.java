package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int tur = 1000;
        int money = 200;
        int ost = 50;
        int month = 5;

        boolean yesORno = tur < (ost * month);
        System.out.println(yesORno);

        int tur2 = 1000;
        int ost2 = 500;
        int month2 = 5;

        boolean yesOrNo = tur2 < (ost2 * month2);
        System.out.println(yesOrNo);
        if (yesOrNo== true){
            System.out.println("Тур берем");

        }
        if (yesOrNo == false){
            System.out.println("Сидим дома");
        }

        int tur3 = 1000;
        int ost3 = 500;
        int month3 = 5;

        boolean yesOrNO = tur3 < (ost3 * month3) && tur3 < 2000;
        System.out.println(yesOrNO);
        if (yesOrNO == true){
            System.out.println("Тур берем");

        }else {
            System.out.println("Сидим Дома");

        }

    }

}
