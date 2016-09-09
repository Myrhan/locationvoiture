package com.adaming.location.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Version : 1
 * Date de création : 09/09/16
 * @author inti0232
 *
 */
@Entity
public class Voiture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVoiture;
	private double kilometrage;
	private String modele;
	private int annee;
	private double prix;
	private String immatriculation;
	
	@ManyToOne
	@JoinColumn(name="agence_id")
	private Agence agence;
	
	@OneToMany(mappedBy="voiture")
	private List<Reservation> listeResa;
	
	public Voiture() {
		// TODO Auto-generated constructor stub
	}
	
	public Voiture(Long idVoiture, double kilometrage, String modele, int annee, double prix, String immatriculation) {
		super();
		this.idVoiture = idVoiture;
		this.kilometrage = kilometrage;
		this.modele = modele;
		this.annee = annee;
		this.prix = prix;
		this.immatriculation = immatriculation;
	}

	public Voiture(double kilometrage, String modele, int annee, double prix, String immatriculation) {
		super();
		this.kilometrage = kilometrage;
		this.modele = modele;
		this.annee = annee;
		this.prix = prix;
		this.immatriculation = immatriculation;
	}

	public Long getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}

	public double getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public List<Reservation> getListeResa() {
		return listeResa;
	}

	public void setListeResa(List<Reservation> listeResa) {
		this.listeResa = listeResa;
	}
	
	
}
