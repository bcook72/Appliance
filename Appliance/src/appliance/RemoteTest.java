package appliance;

/* this test the small remote */

public class RemoteTest {

	public static void main (String[] args) {
		SmallRemote remote = new SmallRemote();
		Mixer mixer = new Mixer(null);
		MixerOn mixerO = new MixerOn(mixer);
		
		remote.setDirect(mixerO);
		remote.buttonWasClicked();
	}
}
