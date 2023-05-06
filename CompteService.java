package com.example.gestioncandidat.services;

import java.util.List;

import com.example.gestioncandidat.entity.Compte;


public interface CompteService {
	public Compte getCompteById(long id);
	public List<Compte> getAllCompte();
	public Compte saveCompte(Compte compte);
	void deleteCompte(Long id);
	public Compte update(Long id, Compte compte);
}
