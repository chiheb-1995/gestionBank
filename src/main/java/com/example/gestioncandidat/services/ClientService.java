package com.example.gestioncandidat.services;

import java.util.List;

import com.example.gestioncandidat.entity.Client;

public interface ClientService {

	public Client getClientId(long id);
	public List<Client> getAllClients();
	public Client saveClient(Client client);
	void deleteClient(Long id);
	public Client getClientByName(String nom);
	public Client update(Long id, Client client);
}
