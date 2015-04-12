package com.lol.abstract_factory;

public class TrainFactory implements CarFactory{
	@Override
	public Wheel createWheel(){
		return new TrainWheel();
	}
	
	@Override
	public Engine createEngine(){
		return new TrainEngine();
	}
}