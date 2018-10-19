package client;

import java.util.ArrayList;


import client.Client;

public class ClientDAO {
	private ArrayList<Client> listClient = null; // Liste D'objet Pizza

	public ClientDAO() throws Exception { // Constructeur avec 3 pizza par default
		super();
		this.listClient = new ArrayList<Client>();
	}
	
	
	
	

	public ArrayList<Client> getListClient() {
		return listClient;
	}

	public void setListClient(ArrayList<Client> listClient) {
		this.listClient = listClient;
	}

	@Override
	public String toString() {
		return "ClientDAO [listClient=" + listClient + "]";
	}





	public ArrayList<Client> afficherAllClients() { // retourn la liste de Client
		return getListClient();
	}
	
	public void saveNewClient(Client client) {			//ajoute Client à la liste 	
		listClient.add(client);
	}


	public void deleteClient(String name) {		//supprime la pizza de code codePizza
		int index=findIndexClientByName(name);
		if (index!=-1) {
			listClient.remove(index);
		}	
	}


	public void updateClient(String name, Client client) {	//met à jour la pizza de code codePizza
		int index=findIndexClientByName(name);
		if (index!=-1) {
			listClient.set(index, client);
			System.out.println("Pizza changer \n\n");
		}
	}
	
	public int findIndexClientByName(String name) {			//renvoi la position du codePizza dans la liste
		int res = -1;
		for (int i = 0; i < listClient.size(); i++) {
			if (listClient.get(i).getNom()==name) {
				res = i;
				break;
			}
		}
		return res;
	}

}
