package com.JoshuaVanBaalen.handson08;

public class HandsOn {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();
		Lizard lizard = new Lizard();
		Turtle turtle = new Turtle();
		
		System.out.println(cat.speak());
		System.out.println(dog.speak());
		System.out.println(cow.speak());
		
		System.out.println(cat.run());
		System.out.println(dog.run());
		System.out.println(cow.run());
		
		System.out.println(cat.eat());
		System.out.println(dog.eat());
		System.out.println(cow.eat());
		
		System.out.println(lizard.eat());
		System.out.println(turtle.eat());
		
		System.out.println(lizard.crawl());
		System.out.println(turtle.crawl());

	}

}
