package com.pizzaBillGenerator;

public class DeluxPizza extends Pizza{

	public DeluxPizza(Boolean veg)
	{
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
	}
	
	public void addExtraCheese() {}
	
	public void addExtraToppings() {}
	
}
