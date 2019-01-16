package lesson2;

public class Homework1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;

        if(a == b || a== c || b==c ){
            System.out.println("Равнобедренный");
        }
        if (a!=b && a!= c && b!= c ){
            System.out.println("Разносторонний");
        }
        if (a==b && a==c && b==c){
            System.out.println("Равносторонний");
        }
    }
}
