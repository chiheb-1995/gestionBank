package com.example.gestioncandidat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestioncandidat.entity.Compte;
import com.example.gestioncandidat.repositories.CompteRepositorie;

@Service
public class CompteServiceImp implements CompteService{
	@Autowired
	CompteRepositorie compteRepositorie;
	@Override
	public Compte getCompteById(long id) {
		return compteRepositorie.findById(id).get();

	}

	@Override
	public List<Compte> getAllCompte() {
		return compteRepositorie.findAll();
		
	}

	@Override
	public Compte saveCompte(Compte compte) {
		return compteRepositorie.save(compte);
	}

	@Override
	public void deleteCompte(Long id) {
		compteRepositorie.deleteById(id);
		
	}
	
	@Override
	 public Compte update(Long id, Compte compte) {
	 Compte compteUpdate = null;
	 compteUpdate = compteRepositorie.save(compte);
	 return compteUpdate;}
}
