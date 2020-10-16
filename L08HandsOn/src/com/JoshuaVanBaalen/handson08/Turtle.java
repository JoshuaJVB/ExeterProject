package com.JoshuaVanBaalen.handson08;

public class Turtle implements Reptile{

	@Override
	public String eat() {
		return "Turtles eat lettuce.";
	}

	@Override
	public String crawl() {
		return "Turtles crawl so fast you wouldn't believe.";
	}

}
