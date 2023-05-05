package com.example.gestioncandidat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.gestioncandidat.entity.Client;

@Repository
public interface ClientRepositorie extends JpaRepository<Client, Long>{

	@Query(value = "SELECT * FROM CLIENT WHERE NOM = ?1", nativeQuery = true)
    Client findByNom(String client);
}
