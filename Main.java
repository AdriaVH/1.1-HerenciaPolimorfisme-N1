
public class Main {

    public static void main(String[] args) {

         //Ex1
        InstrumentVent.play();
        InstrumentCorda violin = new InstrumentCorda("Violí", 99.99);
        violin.play();
        System.out.println(violin.name);
        System.out.println(violin.price);

        //Ex2
        Car.model = "Cupra";
        System.out.println(Car.brand+" "+Car.model);
        Car myCar = new Car("Leon");
        System.out.println(myCar.brand+" "+myCar.model);


        System.out.println(myCar.brand+" "+Car.model);
        System.out.println("myCar Horse power is: "+myCar.horsePower);

        myCar.model = "Ibiza";
        System.out.println(myCar.brand+" "+myCar.model);

        Car.slowDown();
        myCar.speedUp();



    }

}
