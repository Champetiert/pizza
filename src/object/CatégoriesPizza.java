package object;

public enum CatégoriesPizza {
	VIANDE("viande"),
	POISSON("posson"),
	CRUDITE("crudité"),
	FROMAGE("fromage"),
	AUTRE("autre");
	
	private String catégories;

	private CatégoriesPizza(String catégories) {
		this.catégories = catégories;
	}

	public String getCatégories() {
		return catégories;
	}

	public void setCatégories(String catégories) {
		this.catégories = catégories;
	}
}
