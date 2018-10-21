package object;

import interfacePizzeria.ICompteStat;

public class Livreur extends Client implements ICompteStat {


	
	public Livreur(int id, String nom, String prenom, double solde) {
		super(id, nom, prenom, solde);
	}
	
	

	@Override
	public void crediterCompte(double montant) {
		this.setSolde(getSolde() + montant);
	}



	@Override
	public void debiterCompte(double montant)  {
		this.setSolde(getSolde() - montant);
	}







}
