package com.caionilson.core.tema14;

public abstract class DrinkMachine {
	
	abstract void addWater();
	abstract void addMilk();
	abstract void addCoffee();
	abstract void addTea();
	abstract void drinkDone();
	
	final void makeDrink() {
		System.out.println("Preparing the drink");

		addWater();
		addMilk();
		addCoffee();
		addTea();
		drinkDone();
		
		System.out.println("is ready to drink\n");
	}
}
