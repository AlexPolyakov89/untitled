package lesson12.intrnetshops;

public class Main {
    public static void main(String[] args) {
        Photo photo = new Photo();
        photo.setTitle("Кастрюля 7 литров");
        photo.setPath("http://kupit-skovorodu.ru/upload/iblock/0f2/52.jpg");

        Photo photo1 = new Photo();
        photo1.setTitle("Кастрюля 7 литров");
        photo1.setPath("http://kupit-skovorodu.ru/upload/iblock/515/53.jpg");

        Character character = new Character();
        character.setDiametr(26);
        character.setObiom(7);
        character.setRazmer(16);
        character.setMaterial("Сталь эмалированная");

        Tovar kastrula1 = new Tovar();
        kastrula1.setMainName("Кастрюля 7 литров");
        kastrula1.setArticul("1c18c");
        kastrula1.setPrice(790);
        kastrula1.setCharacter(character);
        kastrula1.setPhoto(photo);
        kastrula1.setShortInfo("очень хорошая");
        kastrula1.setMainInfo("кастрюля ваще супер");
        kastrula1.addPhotoToDopPhotos(photo);
        kastrula1.addPhotoToDopPhotos(photo1);






        Photo photo3 = new Photo();
        photo.setTitle("Сковорода 200 мм");
        photo.setPath("http://kupit-skovorodu.ru/upload/iblock/0f2/52.jpg");

        Photo photo4 = new Photo();
        photo1.setTitle("Сковорода 200 мм");
        photo1.setPath("http://kupit-skovorodu.ru/upload/iblock/515/53.jpg");

        Character character1 = new Character();
        character.setDiametr(20);

        character.setRazmer(5.5);
        character.setMaterial("алюминий");

        Tovar skovorodka = new Tovar();
        skovorodka.setMainName("Сковорода 7 литров");
        skovorodka.setArticul("67201");
        skovorodka.setPrice(380);
        skovorodka.setCharacter(character);
        skovorodka.setPhoto(photo);
        skovorodka.setShortInfo("очень хорошая ну просто некуда");
        skovorodka.setMainInfo("сковорода ваще супер просто космос");
        skovorodka.addPhotoToDopPhotos(photo3);
        skovorodka.addPhotoToDopPhotos(photo4);


        Filter.printChipestTovar(kastrula1,skovorodka);


    }
}
