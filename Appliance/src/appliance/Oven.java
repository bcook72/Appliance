package appliance;

/* This is a vendor class for the appliance Oven*/

public class Oven {
	String location;

	public Oven(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " Oven is on");
	}

	public void off() {
		System.out.println(location + " Oven is off");
	}

	public void setTimer() {
		System.out.println(location + " Timer is set");
	}

	public void setFan() {
		System.out.println(location + " Fan is set");
	}

	public void setOvenTemp(int temp) {
		
		System.out.println(location + " Oven temp is set to " + temp);
	}
}
