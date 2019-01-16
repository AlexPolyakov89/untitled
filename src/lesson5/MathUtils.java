package lesson5;

public class MathUtils {

    //метод
    //1 слово модификатор доступа + статичность(есть или нет) + возвращаемый тип (void если не возвращает)+название метода
    public static int summaChisel(int chislo1, int chislo2) {
        int summa = chislo1 + chislo2;
        // обязательно в возвратном типе, отдает решение
        return summa;
    }

    public static int obshiZnam(int znam1, int znam2) {
        for (int i = 1; i < znam1 * znam2; i++) {
            if (i % znam1 == 0 && i % znam2 == 0) {
                return i;//остановка метода

            }
        }
        // когда не сработает ретюрн i ( как елсе после иф)

        return znam1 * znam2;

    }

}
