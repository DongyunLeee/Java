package com.in28minutes.oops.level2;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.3456, "Red");
		System.out.println(fan);
		
		fan.switchOn();
		fan.setSpped((byte)3);
		System.out.println(fan);
		
		fan.switchOff();
		System.out.println(fan);
	}

}
