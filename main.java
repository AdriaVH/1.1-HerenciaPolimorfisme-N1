
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Cotxe.marca);
		Cotxe myCar = new Cotxe();
		Cotxe.model = "Leon";
		System.out.println(myCar.model);
		System.out.println(Cotxe.model);
		System.out.println(myCar.potencia);
		
		myCar.model = "Ibiza";
		System.out.println(myCar.model);
		
		Cotxe.frenar();
		myCar.accelerar();


		InstrumentCorda violin = new InstrumentCorda("Violí", 99.99);
		violin.tocar();
		System.out.println(violin.name);
		System.out.println(violin.price);
	}

}
