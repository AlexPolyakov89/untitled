package lesson1;

public class Main2 {
    public static void main(String[] args) {
        double shirinaRoom = 5.5;
        double dlinnaRoom = 3;
        double shirinaTable = 1.5;
        double dlinnaTable = 1;

        double ploshadRoom = shirinaRoom * dlinnaRoom;
        double ploshdTable = shirinaTable * dlinnaTable;
        int countTableinRoom = (int) (ploshadRoom / ploshdTable);
        System.out.println(countTableinRoom);

    }
}
