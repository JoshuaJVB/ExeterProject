package com.JoshuaVanBaalen.handson08;

public class Cow implements Mammal{

	@Override
	public String speak() {
		return "Moo!";
	}

	@Override
	public String run() {
		return "Cows can run at a top speed of 25 mph!";
	}

	@Override
	public String eat() {
		return "Cows eat grass.";
	}

}
