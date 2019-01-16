package lesson12.intrnetshops;

public class Photo {

    private String title; // описание
    private String path;// путь для загрузки фото

    public Photo (){

    }

    public Photo ( String title, String path){
        this.path = path;
        this.title = title;

    }

    public String getTitle() {
        return title;
    }
    public String getPath() {
        return path;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "title='" + title + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
