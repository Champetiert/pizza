package pizza;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.ListenerNotFoundException;

import error.PizzaException;
import iPizza.IPizzaDao;

public class PizzaMemDao implements IPizzaDao {

	private ArrayList<Pizza> listPizza = null; //Liste D'objet Pizza

	public PizzaMemDao() throws PizzaException { //Constructeur avec 3 pizza par default
		super();

		this.listPizza = new ArrayList<Pizza>();

		this.listPizza.add(new Pizza("MAR", "MARGARITA", 9,CatégoriesPizza.FROMAGE));
		this.listPizza.add(new Pizza("4FRO", "4 FROMAGE", 11,CatégoriesPizza.FROMAGE));
		this.listPizza.add(new Pizza("REI", "REINE", 10,CatégoriesPizza.VIANDE));

	}

	@Override
	public ArrayList<Pizza> findAllPizzas() {	//retourn la liste de pizza
		return getListPizza();
	}

	@Override
	public String toString() {			//affiche list de pizza
		return "PizzaMemDao [listPizza=" + listPizza + "]";
	}

	public ArrayList<Pizza> getListPizza() {		//getter
		return listPizza;
	}

	public void setListPizza(ArrayList<Pizza> listPizza) {//setter
		this.listPizza = listPizza;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {			//ajoute pizza à la liste 	
		listPizza.add(pizza);
	}

	@Override
	public void deletePizza(String codePizza) {		//supprime la pizza de code codePizza
		int index=findIndexPizzaByCode(codePizza);
		if (index!=-1) {
			listPizza.remove(index);
		}	
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {	//met à jour la pizza de code codePizza
		int index=findIndexPizzaByCode(codePizza);
		if (index!=-1) {
			listPizza.set(index, pizza);
			System.out.println("Pizza changer \n\n");
		}
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {			//renvoi la pizza de code codePizza
		Pizza res = null;
		int index=findIndexPizzaByCode(codePizza);
		if (index!=-1) {
			res = listPizza.get(index);
		}
		return res;
	}
	

	public int findIndexPizzaByCode(String codePizza) {			//renvoi la position du codePizza dans la liste
		int res = -1;
		for (int i = 0; i < listPizza.size(); i++) {
			if (listPizza.get(i).getCode().equals(codePizza)) {
				res = i;
				break;
			}
		}
		return res;
	}

	@Override
	public boolean isPizzaExists(String codePizza) {			//renvoi true si la pizza existe sinon false
		boolean res = false;
		if (this.findPizzaByCode(codePizza) != null) {
			res = true;
		}
		return res;
	}

}
