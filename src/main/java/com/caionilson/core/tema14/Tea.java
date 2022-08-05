package com.caionilson.core.tema14;

public class Tea extends DrinkMachine {

	@Override
	void addWater() {
		System.out.println("Putting water");
	}

	@Override
	void addMilk() {

	}

	@Override
	void addCoffee() {

	}

	@Override
	void addTea() {
		System.out.println("Putting tea");
	}
	
	@Override
	void drinkDone() {
		System.out.print("Tea ");
	}

}
