package appliance;

/* This is a vendor class for the appliance Mixer on */

public class MixerOn implements Direct {

	Mixer mixer;
	
	public MixerOn (Mixer mixer) {
		this.mixer = mixer;
	}
	
	public void execute() {
		mixer.on();
	}
	
	public void undo() {
		mixer.off();
	}
}
