package appliance;

/* This is the remote control class*/

public class RemoteControl {
	Direct[] onCommands;
	Direct[] offCommands;
 
	public RemoteControl() {
		onCommands = new Direct[7];
		offCommands = new Direct[7];
 
		Direct noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
  
	public void setCommand(int slot, Direct onCommand, Direct offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasClicked(int slot) {
		onCommands[slot].execute();
	}
 
	public void offButtonWasClicked(int slot) {
		offCommands[slot].execute();
	}
  
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}