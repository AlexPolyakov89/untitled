package lesson10;

public class Main {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Monkey monkey1 = new Monkey();

        Lion lion = new Lion();
        Lion lion1 = new Lion();

        Pinguin pinguin = new Pinguin();
        Pinguin pinguin1 = new Pinguin();

        monkey.print();
        monkey1.print();

        lion.print();
        lion1.print();

        pinguin.print();
        pinguin1.print();


        pinguin.setName("LoLo");
        pinguin1.setName("LoLo");

        pinguin.setCost(12000);
        pinguin1.setCost(12000);

        System.out.println(pinguin1.equals(pinguin));
        System.out.println(pinguin.hashCode());
        System.out.println(pinguin1.hashCode());
        System.out.println(pinguin.toString());

    }
}
