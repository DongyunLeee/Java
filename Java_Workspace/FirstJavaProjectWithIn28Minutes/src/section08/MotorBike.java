package section08;

public class MotorBike {
	// State
	int speed;
	
	// behavior
	// method
	// inputs - int speed
	// outputs - void
	// name - setSpeed
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public static void start() {
		System.out.println("Bike Started!");
	}

}
