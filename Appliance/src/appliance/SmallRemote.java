package appliance;

/* This is a vendor class for a small remote*/

public class SmallRemote {

	Direct slot;
	
	public SmallRemote () {}
	
	public void setDirect(Direct direct) {
		slot = direct;
	}
	
	public void buttonWasClicked() {
		slot.execute();
	}
}
