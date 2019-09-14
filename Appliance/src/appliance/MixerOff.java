package appliance;

/* This is a vendor class for the appliance Mixer off */

public class MixerOff implements Direct {
	
	Mixer mixer;
	
	public MixerOff (Mixer mixer) {
		
		this.mixer = mixer;
	}
	
	public void execute () {
		
		mixer.off();
	}
	
	public void undo() {
		
		mixer.on();
	}

}
