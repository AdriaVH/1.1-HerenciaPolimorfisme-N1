package ex2;

public class Car {
    static final String brand = "Seat";
    static String model;
    final double horsePower = 1.2;

public Car(String model){
    this.model = model;
}
    static void slowDown() {
        System.out.println("El vehicle està frenant");
    }
    public void speedUp() {
        System.out.println("El vehicle està accelerant");
    }

}
