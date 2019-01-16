package lesson12.intrnetshops;

import java.util.Arrays;

public class Tovar {
    private String mainName;
    private String articul;
    private int price;
    private Character character;
    private String shortInfo;
    private Photo photo;
    private Photo[] dopPhoto = new Photo[10];
    private String mainInfo;
    private Tovar[] recomendedTovar = new Tovar[10];

    public Tovar () {

    }

    public Tovar(String mainName,String articul,int price,
                 Character character,String shortInfo,Photo photo,
                 Photo[] dopPhoto,String mainInfo,Tovar[] recomendedTovar) {
        this.articul = articul;
        this.character = character;
        this.dopPhoto = dopPhoto;
        this.mainInfo = mainInfo;
        this.mainName = mainName;
        this.photo = photo;
        this.recomendedTovar = recomendedTovar;
        this.shortInfo = shortInfo;

    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public String getArticul() {
        return articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(String shortInfo) {
        this.shortInfo = shortInfo;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Photo[] getDopPhoto() {
        return dopPhoto;
    }

    public void addPhotoToDopPhotos(Photo photoToAdd) {
        for (int i = 0; i< dopPhoto.length;i++) {
            if (dopPhoto[i] == null) {
                dopPhoto[i] = photoToAdd;
                break;

            }
        }
    }

    public String getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(String mainInfo) {
        this.mainInfo = mainInfo;
    }

    public Tovar[] getRecomendedTovar() {
        return recomendedTovar;
    }

    public void setRecomendedTovar(Tovar[] recomendedTovar) {
        this.recomendedTovar = recomendedTovar;
    }


    @Override
    public String toString() {
        return "Tovar{" +
                "mainName='" + mainName + '\'' + '\n' +
        ", articul='" + articul + '\'' + '\n' +
                ", price=" + price + '\n' +
                ", character=" + character + '\n' +
                ", shortInfo='" + shortInfo + '\'' + '\n' +
                ", photo=" + photo + '\n' +
                ", dopPhoto=" + Arrays.toString(dopPhoto) + '\n' +
                ", mainInfo='" + mainInfo + '\'' + '\n' +
                ", recomendedTovar=" + Arrays.toString(recomendedTovar) + '\n' +
                '}';
    }
}
