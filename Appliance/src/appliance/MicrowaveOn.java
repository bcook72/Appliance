package appliance;

/* Microwave On class */

public class MicrowaveOn implements Direct {

	Microwave microwave;
	
	public MicrowaveOn(Microwave microwave) {
		this.microwave = microwave;
	}
	
	public void execute() {
		microwave.open();
		microwave.setMicrowaveTimer(5);
		microwave.setMicrowaveWatt(1100);
	}
	
	public void undo() {
		microwave.open();
	}
}
