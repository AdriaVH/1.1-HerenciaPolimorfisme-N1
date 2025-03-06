package ex1;

public class Main {

    public static void main(String[] args) {

         //Ex1

        InstrumentCorda violin = new InstrumentCorda("Violí", 99.99);
        violin.play();
        System.out.println(violin.name);
        System.out.println(violin.price);
    }

}
