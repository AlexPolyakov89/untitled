package lesson11;

public class Monkey extends Animal  {
    @Override
    public void voice() {
        System.out.println("iiiiiiiiiiiii");
    }

    @Override
    public void run() {
        System.out.println("Monkey is running");

    }

    @Override
    public void jump() {
        System.out.println("Monkey is jumping");

    }
}
