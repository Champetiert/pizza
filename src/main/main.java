package main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import pizza.Pizza;
import pizza.PizzaMemDao;

public class main {

	public static void main(String[] args) {
		Pizza p1=new Pizza("CHOR", "Chorizo", 10);
		PizzaMemDao pizzaMemDao=new PizzaMemDao();
	
		
		pizzaMemDao.updatePizza("MAR",p1);
		pizzaMemDao.deletePizza("4FRO");
		List<Pizza> listPizza=pizzaMemDao.findAllPizzas();

		System.out.println(listPizza);
		
		//System.out.println(pizzaMemDao.findPizzaByCode(""));
		
		
		System.out.println(pizzaMemDao.isPizzaExists("4FRO"));
	}

}
