package com.lol.adapter;
//adapter,ͨ����������Ǿ��ڱ����ʹ��Power�ֻ࣬��ת����һ�¡�
public class MobilePowerAdapter implements Target{
	private Power power;
	
	public MobilePowerAdapter(){
		this.power = new Power();
	}
	
	@Override
	public int getPower(){
		power.getPower220V();
		/*****��Щ����******/
		return 10;
	}
}
//��Ȼ �����Ҳ��������д
/*
public class MobilePowerAdapter extends Power implements Target{
	@Override
	public int getPower10V{
		super.getPower200V();
		//��Щ����
		return 10;
	}
}*/