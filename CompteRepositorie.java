package com.example.gestioncandidat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.gestioncandidat.entity.Compte;

@Repository
public interface CompteRepositorie extends JpaRepository<Compte, Long> {
	
}
