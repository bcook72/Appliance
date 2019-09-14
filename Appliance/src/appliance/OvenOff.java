package appliance;

/* This is a vendor class for the appliance Oven off*/

public class OvenOff implements Direct {
	Oven oven;
 
	public OvenOff(Oven oven) {
		this.oven = oven;
	}
 
	public void execute() {
		oven.off();
	}
	
	public void undo() {
		oven.on();
	}
}