package client;

import iPizza.ICompteStat;
import pizza.Pizza;

/**
 * @author formation
 *
 */
/**
 * @author formation
 *
 */
public class Client implements ICompteStat{
	private int id;
	private String nom;
	private String prenom;
	private double solde;

	public Client(int id, String nom, String prenom, double solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.solde = solde;
	}

	public void crediterCompte(double montant) throws Exception {
		if (this.getSolde() + montant > 5000) {
			throw new Exception("CreditException");
		}
		this.setSolde(getSolde() + montant);
	}

	public void debiterCompte(double montant) throws Exception {
		if (this.getSolde() + montant < 1) {
			throw new Exception("DebitException");
		}
		this.setSolde(getSolde() - montant);
	}

	public void commandePizza(Pizza pizza) throws Exception {
		this.debiterCompte(pizza.getPrix());
	}

	@Override
	public String toString() {
		return "Client id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", solde=" + solde + "\n\r";
	}

	
	/**
	 * Getter et setter
	 * @return
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
