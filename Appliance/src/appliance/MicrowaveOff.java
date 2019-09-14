package appliance;

/* Microwave Off class */

public class MicrowaveOff implements Direct {

	Microwave microwave;
	
	public MicrowaveOff(Microwave microwave) {
		this.microwave = microwave;
	}
	
	public void execute() {
		microwave.close();
	}
	
	public void undo() {
		microwave.close();
	}

}
