package com.lol.abstract_factory;

public class App{
	public static void main(String[] args){
		createCar(new TrainFactory());
		createCar(new AutoFactory());
	}
	public static void createCar(CarFactory factory){
		System.out.println(factory.createWheel());
		System.out.println(factory.createEngine());
	}
}