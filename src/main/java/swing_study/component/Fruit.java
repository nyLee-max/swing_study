package swing_study.component;

public class Fruit {
	private String name;
	private int price;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getPrice() {
		return price;
	}
	public final void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Fruit(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("%s , %s", name, price);
	}
	
	
}
