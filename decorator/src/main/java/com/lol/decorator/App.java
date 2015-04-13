package com.lol.decorator;

public class App{
	public void test(){
		//普通的猪
		System.out.println("普通的猪！");
		Animal pig = new Pig();
		pig.run();
		//牛逼的猪
		System.out.println("牛逼的猪！");
		Animal eatPig = new EatPig(pig);
		eatPig.run();
	}
}