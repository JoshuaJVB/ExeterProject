package com.JoshuaVanBaalen.handson08;

public class Dog implements Mammal{

	@Override
	public String speak() {
		return "Bark!";
	}

	@Override
	public String run() {
		return "Dogs can run at a top speed of 45 mph";
	}

	@Override
	public String eat() {
		return "Dogs eat bones.";
	}

}
