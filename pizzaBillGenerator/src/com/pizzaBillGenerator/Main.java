package com.pizzaBillGenerator;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Base Pizza:");
		Pizza basePizza =new Pizza(false);
		basePizza.addExtraCheese();
		basePizza.addExtraToppings();
		basePizza.takeAway();
		basePizza.getBill();
		
		System.out.println("Delux Pizza:");
		DeluxPizza db=new DeluxPizza(false);
	    db.takeAway();
		db.getBill();
		
		
     }
	}
		
