package appliance;

/* This sets the commands for remote undo*/

public class RemoteWithUndo {
		Direct[] onCommands;
		Direct[] offCommands;
		Direct undoCommand;
		
		public RemoteWithUndo() {
			onCommands = new Direct[7];
			offCommands = new Direct[7];
	 
			Direct noCommand = new NoCommand();
			for (int i = 0; i < 7; i++) {
				onCommands[i] = noCommand;
				offCommands[i] = noCommand;
			}
			
			undoCommand = noCommand;
		}
	  
		public void setCommand(int slot, Direct onCommand, Direct offCommand) {
			onCommands[slot] = onCommand;
			offCommands[slot] = offCommand;
		}
	 
		public void onButtonWasClicked(int slot) {
			onCommands[slot].execute();
			undoCommand = onCommands[slot];
		}
	 
		public void offButtonWasClicked(int slot) {
			offCommands[slot].execute();
			undoCommand = offCommands[slot];
		}
		
		public void undoButtonWasClicked(RemoteWithUndo remoteControl1) {
			undoCommand.undo();
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

