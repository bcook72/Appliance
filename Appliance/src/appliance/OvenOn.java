package appliance;

/* This is a vendor class for the appliance Oven on*/

public class OvenOn implements Direct {

	Oven oven;
	
	public OvenOn (Oven oven) {
		this.oven = oven;
	}
	
	public void execute() {
		oven.on();
		oven.setTimer();
		oven.setOvenTemp(400);
	}
	
	public void undo() {
		oven.off();
	}
}
