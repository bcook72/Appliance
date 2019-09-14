package appliance;

/* This is a vendor class for the appliance Mixer */

public class Mixer {
	String location;

	public Mixer(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " mixer is on");
	}

	public void off() {
		System.out.println(location + " mixer is off");
	}
}
