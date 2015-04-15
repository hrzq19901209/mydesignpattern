package com.lol.adapter;

public class App{
	public void appTest(){
		MobilePowerAdapter mp = new MobilePowerAdapter();
		System.out.println("我获得了适合手机的电压： "+mp.getPower()+"V");
	}
}