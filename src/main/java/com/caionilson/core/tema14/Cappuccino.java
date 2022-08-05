package com.caionilson.core.tema14;

public class Cappuccino extends DrinkMachine{

	@Override
	void addWater() {
		
	}

	@Override
	void addMilk() {
		System.out.println("Putting milk");
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
		System.out.print("Cappuccino ");
	}

}
