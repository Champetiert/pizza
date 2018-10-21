package object;

import interfacePizzeria.ICompteStat;

/**
 * @author ChampetierT
 *
 */
public class Client implements ICompteStat { // implements ICompteStat for recover the process getSolde()

	private int id;
	private String nom;
	private String prenom;
	private double solde;

	/**
	 * @param id     is single
	 * @param nom    /Name
	 * @param prenom /Firstname
	 * @param solde  / Bank balance
	 */
	public Client(int id, String nom, String prenom, double solde) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.solde = solde;
	}

	/**
	 * @param montant / amount
	 * @throws Exception when the solde/bank balance is greater than 5000
	 * 
	 *                   Credit Account of client
	 */
	public void crediterCompte(double montant) throws Exception {
		if (this.getSolde() + montant > 5000) {
			throw new Exception("CreditException: Le solde ne dois pas dépasser 5000");
		}
		this.setSolde(getSolde() + montant);
	}

	/**
	 * @param montant / amount
	 * @throws Exception when the solde/bank balance is less than 5000
	 * 
	 *                   Debit Account of client
	 */
	public void debiterCompte(double montant) throws Exception {
		if (this.getSolde() - montant < 0) {
			throw new Exception("DebitException: Le solde ne dois pas etre inferieur à 0");
		}
		this.setSolde(getSolde() - montant);
	}

	/**
	 * @param pizza
	 * @throws Exception when the solde/bank balance is less than 5000
	 * 
	 *                   Order pizza
	 */
	public void commanderPizza(Pizza pizza) throws Exception {
		this.debiterCompte(pizza.getPrix());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Client id=" + id + "\n nom=" + nom + "\n prenom=" + prenom + "\n solde=" + solde + "\n\r";
	}

	/**
	 * Getter and setter
	 * 
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
