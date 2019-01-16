package lesson12.intrnetshops;

public class Character {

    private double diametr;
    private double obiom;
    private double razmer;
    private String material;

    public Character() {

    }
    public Character( double diametr,double obiom,double razmer,String material) {

        this.diametr = diametr;
        this.obiom = obiom;
        this.razmer = razmer;
        this.material = material;

    }

    public double getDiametr() {
        return diametr;
    }
    public double getObiom() {
        return obiom;
    }
    public double getRazmer() {
        return razmer;
    }
    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }
    public void setObiom( double obiom) {
        this.obiom = obiom;
    }
    public void setRazmer(double razmer) {
        this.razmer = razmer;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Character{" +
                "diametr=" + diametr +
                ", obiom=" + obiom +
                ", razmer=" + razmer +
                ", material='" + material + '\'' +
                '}';
    }
}
