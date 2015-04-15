package com.lol.adapter;
//adapter,通过这个类我们就在变像的使用Power类，只是转换了一下。
public class MobilePowerAdapter implements Target{
	private Power power;
	
	public MobilePowerAdapter(){
		this.power = new Power();
	}
	
	@Override
	public int getPower(){
		power.getPower220V();
		/*****做些处理******/
		return 10;
	}
}
//当然 这个类也可以这样写
/*
public class MobilePowerAdapter extends Power implements Target{
	@Override
	public int getPower10V{
		super.getPower200V();
		//做些处理
		return 10;
	}
}*/