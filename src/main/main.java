package main;

import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.ClientDAO;
import dao.PizzaMemDao;
import error.PizzaException;
import object.CatégoriesPizza;
import object.Client;
import object.Pizza;

public class main {

	public static void main(String[] args) {
		
		try {
			Pizza p1=new Pizza("CHOR", "Chorizo", 15,CatégoriesPizza.VIANDE);
			PizzaMemDao pizzaMemDao=new PizzaMemDao();
			pizzaMemDao.updatePizza("MAR",p1);
			pizzaMemDao.deletePizza("4FRO");
			pizzaMemDao.saveNewPizza(new Pizza("CAL", "CALZON", 12.50f,CatégoriesPizza.AUTRE));
			List<Pizza> listPizza=pizzaMemDao.findAllPizzas();
			System.out.println(listPizza);
			System.out.println(pizzaMemDao.isPizzaExists("4FRO"));
			
			try {
				Client client1=new Client(1, "Jony", "Depp", 50);
				Client client2=new Client(2, "Paris", "Hilton", 30);
				Client client3=new Client(3, "Dwayne ", "Johnson", 100);
				ClientDAO listClient=new ClientDAO();
				listClient.saveNewClient(client1);
				listClient.saveNewClient(client2);
				listClient.saveNewClient(client3);
				client1.commandePizza(p1);
				client2.crediterCompte(50);
				client2.debiterCompte(15);
				DoubleSummaryStatistics stats=listClient.afficherAllClients().stream().mapToDouble(c->c.getSolde()).summaryStatistics();
				System.out.println(	"Nombre de comptes = "+stats.getCount()+"\n"
									+ "Total Solde de tous les comptes = "+stats.getSum()+" €\n"
									+ "Moyenne Solde = "+(""+stats.getAverage()).substring(0,5)+" €\n"
									+ "Solde le plus faible = "+stats.getMin()+" €\n"
									+ "Solde le plus élevé = "+stats.getMax()+" €\n");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}catch(PizzaException e){
			System.out.println(e.getMessage());	
		}
		
		
	}

}
