public abstract class Instrument {

    String	name;
    double	price;

    public static void play() {
    }

    public Instrument (String name, double price) {
        this.name = name;
        this.price = price;
    }

}