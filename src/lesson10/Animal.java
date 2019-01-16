package lesson10;

public class Animal {
    private String name;
    private int cost;// цена

    public Animal() {

    }

    public Animal(String name, int cost) {
        this.cost = cost;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;

    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void print() {
        System.out.println("Animal: name - " + this.name + ", cost - " + this.getCost());// можно  просто cost
    }

    @Override
    public boolean equals(Object o) {// правая кнопка Генерейт!!!
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (cost != animal.cost) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
