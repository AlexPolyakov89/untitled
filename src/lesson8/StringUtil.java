package lesson8;

public class StringUtil {
    public static String coding(String masseg) {

        String alfavi = "abcdefghijklmnopqrstuvwxyz";// строка алфавита

        char[] alfavitLittel = alfavi.toCharArray();// создали массив малого алфавита

        char[] alfavitBig = alfavi.toUpperCase().toCharArray();// создали массив больших букв

        char[] charsFromMesseg = masseg.toCharArray();// мэсседж превратили в массив

        // for each
        for (char tekushiSimvol : charsFromMesseg) {// текущий символ смессенджера
            int index = alfavi.indexOf(tekushiSimvol);
            index = index + 3;
            char newChar = alfavi.charAt(index);
            System.out.print(newChar);
        }





        return null;

    }
}
