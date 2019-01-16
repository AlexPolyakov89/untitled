package lesson4;

public class Main1 {
    public static void main(String[] args) {


        for ( int day= 1;day < 366;day++){
            for (int hour = 0; hour < 24; hour++) {
                for (int minet = 0; minet < 60; minet++) {
                    for (int seconds = 0; seconds < 60; seconds++) {
                        System.out.println("от старта прошло:"+ day + "дней,"+ hour + "часов," + minet+"минут,"+ seconds+"секунд,");

                        try {
                            Thread.sleep(1000);// вызывает лампочку
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        }
    }
}
