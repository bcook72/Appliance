package appliance;

/* Test for resting remote connection for appliances */

public class ApplianceRun {
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Mixer mixer1 = new Mixer("Cake Mixer");
		Mixer mixer2 = new Mixer("Brownie Mixer");
		Oven oven = new Oven("Oven");
	
  
		MixerOn mixer1On = 
				new MixerOn(mixer1);
		MixerOff mixer1Off = 
				new MixerOff(mixer1);
		MixerOn mixer2On = 
				new MixerOn(mixer2);
		MixerOff mixer2Off = 
				new MixerOff(mixer2);
		OvenOn ovenon = 
				new OvenOn(oven);
		OvenOff ovenoff = 
				new OvenOff(oven);
 
 
		remoteControl.setCommand(0, mixer1On, mixer1Off);
		remoteControl.setCommand(1, mixer2On, mixer2Off);
		remoteControl.setCommand(2, ovenon, ovenoff);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasClicked(0);
		remoteControl.offButtonWasClicked(0);
		remoteControl.onButtonWasClicked(1);
		remoteControl.offButtonWasClicked(1);
		remoteControl.onButtonWasClicked(2);
		remoteControl.offButtonWasClicked(2);
	
	}
}
