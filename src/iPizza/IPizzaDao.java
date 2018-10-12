package iPizza;

import java.util.List;

import pizza.Pizza;

public interface IPizzaDao {
	List<Pizza> findAllPizzas();
	void updatePizza(String codePizza, Pizza pizza);
	Pizza findPizzaByCode(String codePizza);
	boolean isPizzaExists(String codePizza);
}
