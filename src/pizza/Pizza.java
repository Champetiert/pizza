package pizza;

import error.PizzaException;

public class Pizza {
	private String code;
	private String désignation;
	private float prix;
	private CatégoriesPizza catégorie;

	public Pizza(String code, String désignation, float prix,CatégoriesPizza catégorie) throws PizzaException {

		String messageErreur = null;

		if (code.trim().length() > 4) {
			messageErreur += "Code pizza trop long \n\r";
		}
		if (prix <= 0) {
			messageErreur += "Prix doit etre > à 0\n\r";
		}
		if(catégorie==null) {
			messageErreur += "Définir une catégorie \n\r";
		}
		
		if (messageErreur == null) {
			this.code = code;
			this.désignation = désignation;
			this.prix = prix;
			this.catégorie=catégorie;
		} else {
			throw new PizzaException(messageErreur);
		}
	}



	@Override
	public String toString() {
		return "Pizza code=" + code + ", désignation=" + désignation + ", prix=" + prix + ", catégorie=" + catégorie.getCatégories()+"\n\r";
	}



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDésignation() {
		return désignation;
	}

	public void setDésignation(String désignation) {
		this.désignation = désignation;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

}
