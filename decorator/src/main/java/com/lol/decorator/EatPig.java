package com.lol.decorator;

public class EatPig implements Animal{
	//�����ε���
	Animal decorator;
	public EatPig(Animal decorator){
		this.decorator = decorator;
	}
	
	@Override
	public void run(){
		decorator.run();
		System.out.println("���ڳԣ�");
	}
}