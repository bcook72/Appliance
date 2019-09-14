package appliance;

/* This test the undo remote*/

public class UndoRemoteTest {

	public static void main(String[] args) {
		RemoteWithUndo remoteControl1 = new RemoteWithUndo();
		
		Mixer mixer1 = new Mixer("Cake Mixer");
  
		MixerOn mixer1On = 
				new MixerOn(mixer1);
		MixerOff mixer1Off = 
				new MixerOff(mixer1);
 
 
		remoteControl1.setCommand(0, mixer1On, mixer1Off);
 
		remoteControl1.onButtonWasClicked(0);
		remoteControl1.offButtonWasClicked(0);
		remoteControl1.undoButtonWasClicked(remoteControl1);
		remoteControl1.offButtonWasClicked(0);
		remoteControl1.onButtonWasClicked(0);
		System.out.println(remoteControl1);

}
}
