package lesson2;

public class Homework2 {
    public static void main(String[] args) {
        // а - длинна б- ширина с - высота ящика ( брал за основу параллелограмм )
        int a = 5;
        int b = 10;
        int c = 20;
        // длинна грани стороны куба
        int a1 = 4;

        // spr - площадь ящика(параллелограмм),  skv -площадь куба , kolvo- в ящике кубиков //

        int spr = 2 * (a * b + b * c + a * c);
        int skv = 6 * (a1 * a1);
        int kolvo = spr / skv;
        System.out.println(kolvo);
    }
}
