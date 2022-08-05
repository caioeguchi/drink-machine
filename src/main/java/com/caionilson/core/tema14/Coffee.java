package com.caionilson.core.tema14;

public class Coffee extends DrinkMachine {

	@Override
	void addWater() {
		System.out.println("Putting water");
	}

	@Override
	void addMilk() {

	}

	@Override
	void addCoffee() {
		System.out.println("Putting coffee");
	}

	@Override
	void addTea() {

	}

	@Override
	void drinkDone() {
		System.out.print("Coffee ");
	}

}
