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

import com.example.gestioncandidat.entity.Compte;
import com.example.gestioncandidat.services.CompteService;


	@RestController
	@RequestMapping("/Compte")
	public class CompteController {
	@Autowired
	CompteService compteService;
	@GetMapping("/getCompte/{id}")
	public Compte getCompte(@PathVariable ("id") long id) {
		return compteService.getCompteById(id);
	}

	@GetMapping("/getAllCompte")
	public List<Compte> getAllComptes() {
		return compteService.getAllCompte();
	}

	@PostMapping("/compte")
	public Compte saveClient(@RequestBody Compte compte) {
		return compteService.saveCompte(compte);
	}

	@DeleteMapping("/deleteCompte/{id}")
	void deleteCompte(@PathVariable Long id) {
		compteService.deleteCompte(id);
	}
	@PutMapping("/updateCompte/{id}")
	public Compte update(@RequestBody Compte compte, @PathVariable("id") Long id) {
	Compte comptePostSave = null;

	 return comptePostSave = compteService.update(id, compte);

	
	}
}
