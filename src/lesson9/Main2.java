package lesson9;

public class Main2 {
    public static void main(String[] args) {
        FractionNumber drob1 = new FractionNumber(1, 2);
        FractionNumber drob2 = new FractionNumber();
        drob2.setChislitel(3);
        drob2.setZnamenatel(4);

        FractionNumber resultSlojenie = drob1.slojenie(drob2);
        System.out.println(resultSlojenie.getChislitel());
        System.out.println(resultSlojenie.getZnamenatel());
    }
}
