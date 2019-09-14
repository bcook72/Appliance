package appliance;

/* Dishwasher class */

public class Dishwasher {
	String location;

	public Dishwasher(String location) {
		this.location = location;
	}

	public void DishwasherOn() {
		System.out.println(location + " dishwasher is on");
	}

	public void DishwasherOff() {
		System.out.println(location + " dishwasher is off");
	}
}
