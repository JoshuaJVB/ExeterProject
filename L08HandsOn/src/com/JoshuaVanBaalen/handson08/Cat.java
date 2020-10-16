package com.JoshuaVanBaalen.handson08;

public class Cat implements Mammal{

	@Override
	public String speak() {
		return "Meow!";
	}

	@Override
	public String run() {
		return "Cats can run at a top speed of 30 mph!";
	}

	@Override
	public String eat() {
		return "Cats eat mice.";
	}

}
