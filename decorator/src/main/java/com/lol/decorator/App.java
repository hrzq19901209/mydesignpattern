package com.lol.decorator;

public class App{
	public void test(){
		//��ͨ����
		System.out.println("��ͨ����");
		Animal pig = new Pig();
		pig.run();
		//ţ�Ƶ���
		System.out.println("ţ�Ƶ���");
		Animal eatPig = new EatPig(pig);
		eatPig.run();
	}
}