package pizza;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.ListenerNotFoundException;

import iPizza.IPizzaDao;

public class PizzaMemDao implements IPizzaDao {
	
	private ArrayList<Pizza> listPizza= null;
	

	public PizzaMemDao() {
		super();
		
		this.listPizza=new ArrayList<Pizza>();
		
		this.listPizza.add(new Pizza("MAR", "MARGARITA", 9));
		this.listPizza.add(new Pizza("4FRO", "4 FROMAGE", 11));
		this.listPizza.add(new Pizza("REI", "REINE", 10));
		
	}

	@Override
	public ArrayList<Pizza> findAllPizzas() {
	
		return getListPizza();
	}

	@Override
	public String toString() {
		
		return "PizzaMemDao [listPizza=" + listPizza + "]";
	}

	public ArrayList<Pizza> getListPizza() {
		return listPizza;
	}

	public void setListPizza(ArrayList<Pizza> listPizza) {
		this.listPizza = listPizza;
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		/*for (int i = 0; i < piz.length; i++) {
			if (piz[i].getCode().equals(codePizza)) {
				piz[i] = pizza;
				System.out.println("Pizza chager \n\n");
			}
		}*/

	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		Pizza res=null;
		
		/*for (int i = 0; i < piz.length; i++) {
			if (piz[i].getCode().equals(codePizza)) {
				res= piz[i];
				break;
			}
		}*/

		return res;
	}

	@Override
	public boolean isPizzaExists(String codePizza) {
		if (this.findPizzaByCode(codePizza)==null) {
			return false;
		} else {
			return true;
		}

	}

}
