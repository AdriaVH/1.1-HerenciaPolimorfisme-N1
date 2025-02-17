
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstrumentCorda corda = new InstrumentCorda("Violí", 99.99);
		corda.tocar();
		System.out.println(corda.name);
		System.out.println(corda.price);
	}

}
