package section08;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducatiBike = new MotorBike();
		MotorBike hondaBike = new MotorBike();
		
		ducatiBike.start();
		hondaBike.start();
		
		ducatiBike.speed = 100;
		hondaBike.speed = 80;
		
		ducatiBike.speed = 20;
		hondaBike.speed = 0;
	}

}
