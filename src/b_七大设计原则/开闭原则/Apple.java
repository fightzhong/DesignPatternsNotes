package b_七大设计原则.开闭原则;

public class Apple implements Fruits {
	int id;
	String name;
	double price;

	public Apple (int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	@Override
	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	@Override
	public double getPrice () {
		return price;
	}

	public void setPrice (double price) {
		this.price = price;
	}
}
