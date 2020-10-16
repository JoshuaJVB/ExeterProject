package com.JoshuaVanBaalen.handson08;

public class Lizard implements Reptile{

	@Override
	public String eat() {
		return "Lizards eat crickets.";
	}

	@Override
	public String crawl() {
		return "Lizards crawl like so fast my dude.";
	}

}
