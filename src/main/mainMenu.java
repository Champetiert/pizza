package main;

import java.util.Scanner;

import pizza.Pizza;
import pizza.PizzaMemDao;

public class mainMenu {

	public static void mainMenu(String[] args) {
		// Pizza p1=new Pizza("CHOR", "Chorizo", 10);
		PizzaMemDao tabPiz = new PizzaMemDao();
		Scanner questionUser = new Scanner(System.in);
		int a = 0, prix;
		String codePizza, nomPizza;
		Pizza p1;

		while (a != 5) {
			System.out.println("1.Afficher toute les pizza\n" + "2. Changer une pizza\n"
					+ "3. Chercher une pizza par son Code\n" + "4. Verifier qu'une pizza existe\n" + "5. finir programme \n");
			
			a = questionUser.nextInt();
			
			switch (a) {
			case 1:
				tabPiz.findAllPizzas();
				break;
			case 2:
				System.out.println("saisir la nouvel pizza" + "\n code Pizza:");
				codePizza = questionUser.nextLine();
				System.out.println("nom Pizza:");
				nomPizza = questionUser.nextLine();
				System.out.println("Prix:");
				prix = questionUser.nextInt();
				
				p1 = new Pizza(codePizza, nomPizza, prix);
				System.out.println("saisir code pizza à changer");
				codePizza = questionUser.nextLine();
				tabPiz.updatePizza(codePizza, p1);
				questionUser.next();
				break;

			case 3:
				System.out.println("saisir code pizza");
				codePizza = questionUser.nextLine();
				System.out.println(tabPiz.findPizzaByCode(codePizza));
				break;
			case 4:
				System.out.println("saisir code pizza");
				codePizza = questionUser.nextLine();
				System.out.println(tabPiz.isPizzaExists(codePizza) ? "Existe" : "n'existe pas");
				break;
			case 5:	
				break;
			default:
				System.out.println("saisir valeur valide");
			
			}

		}
	}

}
