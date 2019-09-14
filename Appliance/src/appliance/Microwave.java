package appliance;

/* Microwave class */

public class Microwave {
	String location;

	public Microwave(String location) {
		this.location = location;
	}

	public void open() {
		System.out.println(location + " microwave door is open");
	}

	public void close() {
		System.out.println(location + " microwave door is closed");
	}

	public void setMicrowaveTimer(int time) {
		System.out.println(location + " Timer is set to" + time);
	}


	public void setMicrowaveWatt(int wattage) {
		
		System.out.println(location + " Oven temp is set to " + wattage);
	}
}
