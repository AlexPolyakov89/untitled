package lesson12.intrnetshops;

public class Filter {

    public static void printChipestTovar(Tovar tovar1, Tovar tovar2) {
        if (tovar1.getPrice() < tovar2.getPrice()) {
            System.out.println(tovar1);

        } else {
            System.out.println(tovar2);
        }
    }
}
