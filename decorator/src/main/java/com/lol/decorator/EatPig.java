package com.lol.decorator;

public class EatPig implements Animal{
	//被修饰的类
	Animal decorator;
	public EatPig(Animal decorator){
		this.decorator = decorator;
	}
	
	@Override
	public void run(){
		decorator.run();
		System.out.println("正在吃！");
	}
}