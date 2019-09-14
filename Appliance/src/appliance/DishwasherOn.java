package appliance;

/* Dishwasher on class */

public class DishwasherOn implements Direct {

	Dishwasher dishwasher;
	
	public DishwasherOn (Dishwasher dishwasher) {
		this.dishwasher = dishwasher;
	}
	
	public void execute() {
		dishwasher.DishwasherOn();
	}
	
	public void undo() {
		dishwasher.DishwasherOff();
	}
}
