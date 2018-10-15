package main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import client.Client;
import client.ClientDAO;
import error.PizzaException;
import pizza.CatégoriesPizza;
import pizza.Pizza;
import pizza.PizzaMemDao;

public class main {

	public static void main(String[] args) {
		
		try {
			Pizza p1=new Pizza("CHOR", "Chorizo", 15,CatégoriesPizza.VIANDE);
			/*PizzaMemDao pizzaMemDao=new PizzaMemDao();
			pizzaMemDao.updatePizza("MAR",p1);
			pizzaMemDao.deletePizza("4FRO");
			pizzaMemDao.saveNewPizza(new Pizza("CAL", "CALZON", 12.50f,CatégoriesPizza.AUTRE));
			List<Pizza> listPizza=pizzaMemDao.findAllPizzas();
			System.out.println(listPizza);
			System.out.println(pizzaMemDao.isPizzaExists("4FRO"));*/
			
			try {
				Client client1=new Client(1, "Jony", "Depp", 50);
				Client client2=new Client(1, "Paris", "Hilton", 30);
				ClientDAO listClient=new ClientDAO();
				listClient.saveNewClient(client1);
				listClient.saveNewClient(client2);
				client1.commandePizza(p1);
				client2.crediterCompte(50);
				System.out.println(listClient.afficherAllClients());
			}catch(Exception e) {
				
			}
		}catch(PizzaException e){
			System.out.println(e.getMessage());	
		}
		
		
	}

}
