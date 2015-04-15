package com.lol.adapter;

//adaptee,我们的手机充电不需要220V的电压，我们要为这个类创建一个adapter去转换这个类
public class Power{
	public int getPower220V(){
		return 220;
	}
}