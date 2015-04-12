package com.lol.abstract_factory;

public class AutoFactory implements CarFactory{
	@Override
	public Wheel createWheel(){
		return new AutoWheel();
	}
	
	@Override
	public Engine createEngine(){
		return new AutoEngine();
	}
}