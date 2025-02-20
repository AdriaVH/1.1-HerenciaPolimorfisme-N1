package ex2;

import ex1.InstrumentCorda;
import ex1.InstrumentVent;

public class Main {

    public static void main(String[] args) {

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
