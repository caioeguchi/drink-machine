package com.caionilson.core.tema14;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DrinkMachineTest {

	@Spy
	private Coffee coffee = new Coffee();

	@Spy
	private Tea tea = new Tea();

	@Spy
	private Cappuccino cappuccino = new Cappuccino();

	@Test
	public void coffeeTest() {
		coffee.makeDrink();

		Mockito.verify(coffee).addCoffee();
		Mockito.verify(coffee).addMilk();
		Mockito.verify(coffee).addTea();
		Mockito.verify(coffee).addWater();
		Mockito.verify(coffee).drinkDone();
	}
	
	@Test
	public void teaTest() {
		tea.makeDrink();

		Mockito.verify(tea).addCoffee();
		Mockito.verify(tea).addMilk();
		Mockito.verify(tea).addTea();
		Mockito.verify(tea).addWater();
		Mockito.verify(tea).drinkDone();
	}
	
	@Test
	public void cappuccinoTeste() {
		cappuccino.makeDrink();

		Mockito.verify(cappuccino).addCoffee();
		Mockito.verify(cappuccino).addMilk();
		Mockito.verify(cappuccino).addTea();
		Mockito.verify(cappuccino).addWater();
		Mockito.verify(cappuccino).drinkDone();
	}

}
