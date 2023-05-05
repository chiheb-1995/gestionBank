package com.example.gestioncandidat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestioncandidat.entity.Client;
import com.example.gestioncandidat.services.ClientService;

@RestController
@RequestMapping("/Client")
public class ClientController {
@Autowired
ClientService clientService;
@GetMapping("/getClient/{id}")
public Client getClient(@PathVariable ("id") long id) {
	return clientService.getClientId(id);
}

@GetMapping("/getAllclients")
public List<Client> getAllClients() {
	return clientService.getAllClients();
}

@PostMapping("/client")
public Client saveClient(@RequestBody Client client) {
	return clientService.saveClient(client);
}

@DeleteMapping("/deleteClient/{id}")
void deleteClient(@PathVariable Long id) {
	clientService.deleteClient(id);
}

@PutMapping("/updateClient/{id}")
/*Client update(@RequestBody Client client, @PathVariable Long id) {
	return clientService
}*/
public Client update(@RequestBody Client client, @PathVariable("id") Long id) {
	Client clientPostSave = null;
	
		return clientPostSave = clientService.update(id, client);
	
	
	
	//return ResponseEntity.status(HttpStatus.OK).body(appointmentPostSave);
}


}
