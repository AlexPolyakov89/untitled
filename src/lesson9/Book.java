package lesson9;

public class Book {
    private int stranici;
    private String nazvanie;
    private String avtor;
    private int godIzdania;
    private String pereplet;
    private int shirina;
    private int dlinna;
    private int visota;

    public Book() {


    }

    public Book(String avtorBook, String nazvanieBook, int godIzdaniaBook) {
        avtor = avtorBook;
        nazvanie = nazvanieBook;
        godIzdania = godIzdaniaBook;

    }

    public Book(int straniciBook, String nazvanieBook, String avtorBook, int godIzdaniaBook,
                String perepletBook, int shirinaBook, int dlinnaBook, int visotaBook) {
        stranici = straniciBook;
        nazvanie = nazvanieBook;
        avtor = avtorBook;
        godIzdania = godIzdaniaBook;
        pereplet = perepletBook;
        shirina = shirinaBook;
        dlinna = dlinnaBook;
        visota = visotaBook;

    }

    public void setStranici(int newCountstranica) {
        stranici = newCountstranica;
    }
    public int getStranici() {
        return stranici;
    }

    public void print() {
        System.out.println("Книга: автор - " + avtor + " Название - " + nazvanie + " страниц - " + stranici);
    }
}
