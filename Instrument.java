public abstract class Instrument {

	String	name;
	double	price;
	
	public abstract void tocar();
	
	public Instrument (String name, double price) {
		this.name = name;
		this.price = price;
	}

}