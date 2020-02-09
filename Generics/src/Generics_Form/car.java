package Generics_Form;

public class car implements Comparable<car> {

	int speed;
	String color;
	int price;

	public car(int s, String c, int p) {
		speed = s;
		color = c;
		price = p;
	}

	@Override
	public String toString() {
		return "{S:" + speed + "P:" + price + "C:" + color + "}";
	}

	public int compareTo(car o) {
		return o.price-this.price;
		//return this.speed - o.speed;
	}
}
