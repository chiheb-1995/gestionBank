package com.example.gestioncandidat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Compte {
	@Id
	@GeneratedValue
	private long id; 
	private String nomproprietaire; 
	private String solde;

	/**
	 * @return the id
	 */
	public long getId() {

		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {

		this.id = id;
	}

	public Compte() {

		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param nom
	 * @param lastName
	 */
	public Compte( String nomproprietaire, String solde) {

		super();
		this.nomproprietaire = nomproprietaire;
		this.solde = solde;
	}

	}


