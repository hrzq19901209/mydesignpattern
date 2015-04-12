package com.lol.abstract_factory;

public interface CarFactory{
	public Wheel createWheel();
	public Engine createEngine();
}