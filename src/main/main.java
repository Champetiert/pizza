package main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import error.PizzaException;
import pizza.CatégoriesPizza;
import pizza.Pizza;
import pizza.PizzaMemDao;

public class main {

	public static void main(String[] args) {
		
		try {
		Pizza p1=new Pizza("CHOR", "Chorizo", 10,CatégoriesPizza.VIANDE);
		PizzaMemDao pizzaMemDao=new PizzaMemDao();
		pizzaMemDao.updatePizza("MAR",p1);
		pizzaMemDao.deletePizza("4FRO");
		pizzaMemDao.saveNewPizza(new Pizza("CAL", "CALZON", 12.50f,CatégoriesPizza.AUTRE));
		List<Pizza> listPizza=pizzaMemDao.findAllPizzas();
		System.out.println(listPizza);
		
		//System.out.println(pizzaMemDao.findPizzaByCode(""));
			
		System.out.println(pizzaMemDao.isPizzaExists("4FRO"));
		
		}catch(PizzaException e){
			System.out.println(e.getMessage());	
		}
	}

}
