package com.example.gestioncandidat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	
	public long getId() {

		return id;
	}
	
	public void setId(long id) {

		this.id = id;
	}
	
	public String getNom() {

		return nom;
	}
	
	public void setNom(String nom) {

		this.nom = nom;
	}
	
	public String getPrenom() {

		return prenom;
	}
	
	public void setPrenom(String prenom) {

		this.prenom = prenom;
	}
	
	public Client() {

		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client( String nom, String prenom) {

		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
}
