package lesson3;

public class Main4 {
    public static void main(String[] args) {
        // создать массив чисел кратных 2 , в размере 10 ячеек

        // создаем массив 10
        int[] massiv = new int[10];
        // задаем старт индекса
        int index = 0;
        for (int i = 0; i<100; i ++){
            // задаем условие кратности 2
            if (i % 2 ==0){
                massiv[index] = i;
                index++;
            }
            // ставим ограничение по индексу
            if(index==10){
                // стоп по кол-ву индекса (ячеек)
                break;
            }
        }
        // выводим решение
        for ( int i =0 ; i <10; i ++){
            System.out.println(massiv[i]);
        }
    }
}
