package ex1;

public abstract class Instrument {

    String	name;
    double	price;

    public void play() {
    }

    public Instrument (String name, double price) {
        this.name = name;
        this.price = price;
    }
    static {
        System.out.println("Static Block initialized in class Instrument");
    }

}