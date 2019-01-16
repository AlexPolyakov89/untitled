package lesson9;

public class Main {
    public static void main(String[] args) {
        Book pushkin = new Book();
        Book esenin = new Book("Esenin","qwerty",1000);
        Book book1 = new Book(2100, "Unisennie Vetrom", "Metelskiy",
                2010, "Koja", 20, 10, 5);

        book1.setStranici(2200);


        pushkin.print();
        esenin.print();
        book1.print();







    }
}
