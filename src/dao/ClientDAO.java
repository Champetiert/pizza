package dao;

import java.util.ArrayList;

import object.Client;
import object.Pizza;

/**
 * @author ChampetierT
 *
 */
/**
 * @author ChampetierT
 *
 */
/**
 * @author ChampetierT
 *
 */
public class ClientDAO {

	private ArrayList<Client> listClient = null; // Liste D'objet Pizza

	/**
	 * @throws Exception
	 */
	public ClientDAO() throws Exception { // Constructeur avec 3 pizza par default
		super();
		this.listClient = new ArrayList<Client>();
	}

	/**
	 * @return
	 */
	public ArrayList<Client> getListClient() {
		return listClient;
	}

	/**
	 * @param listClient
	 */
	public void setListClient(ArrayList<Client> listClient) {
		this.listClient = listClient;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientDAO [listClient=" + listClient + "]";
	}

	/**
	 * @return Liste Client
	 */
	public ArrayList<Client> afficherAllClients() { // retourn la liste de Client
		return getListClient();
	}

	/**
	 * @param client
	 * 
	 *               add new client
	 */
	public void saveNewClient(Client client) { // ajoute Client à la liste
		listClient.add(client);
	}

	/**
	 * @param name
	 * 
	 *             remove client with this name
	 */
	public void deleteClient(String name) { // supprime la pizza de code codePizza
		int index = findIndexClientByName(name);
		if (index != -1) {
			listClient.remove(index);
		}
	}

	/**
	 * @param name
	 * @param client
	 * 
	 *               change client with name "name" to Client client
	 */
	public void updateClient(String name, Client client) { // met à jour la pizza de code codePizza
		int index = findIndexClientByName(name);
		if (index != -1) {
			listClient.set(index, client);
			System.out.println("Pizza changer \n\n");
		}
	}

	/**
	 * @param name of client
	 * @return Client with name "name"
	 */
	public Client findPizzaByName(String name) { // renvoi la Client nom "nom"
		Client res = null;
		int index = findIndexClientByName(name);
		if (index != -1) {
			res = listClient.get(index);
		}
		return res;
	}

	/**
	 * @param name
	 * @return position of client in listClient
	 */
	public int findIndexClientByName(String name) { // renvoi la position du Client dans la liste
		int res = -1;
		for (int i = 0; i < listClient.size(); i++) {
			if (listClient.get(i).getNom().equals(name)) {
				res = i;
				break;
			}
		}
		return res;
	}

}
