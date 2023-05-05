package com.example.gestioncandidat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestioncandidat.entity.Client;
import com.example.gestioncandidat.repositories.ClientRepositorie;

@Service
public class ClientServiceImp implements ClientService{

	@Autowired
	ClientRepositorie clientRepositorie;
	
	@Override
	public Client getClientId(long id) {
		return clientRepositorie.findById(id).get();
	}
	
	@Override
	public List<Client> getAllClients(){
		return clientRepositorie.findAll();
	}

	@Override
	public Client saveClient(Client client) {
		return clientRepositorie.save(client);
	}

	@Override
	public void deleteClient(Long id) {
		clientRepositorie.deleteById(id);
		
	}

	@Override
	public Client getClientByName(String nom) {
		return clientRepositorie.findByNom(nom);
	}

	@Override
	public Client update(Long id, Client client) {
		Client clientUpdate = null;
		clientUpdate = clientRepositorie.save(client);
		return clientUpdate;
	}
}
