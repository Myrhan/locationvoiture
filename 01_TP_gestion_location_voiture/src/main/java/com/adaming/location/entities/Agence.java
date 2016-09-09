package com.adaming.location.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Agence {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAgence;
	private String nomAgence;
	private String adresse;
	private String mail;
	private String telephone;
	
	@ManyToMany
	@JoinTable(name="client_agence")
	private List<Client> listeClient;
	
	@OneToMany(mappedBy="agence")
	private List<Facture> listeFacture;
	
	@OneToMany(mappedBy="agence")
	private List<Voiture> listeVoiture;
	
	@OneToMany
	@JoinTable(name="resa_agence")
	private List<Reservation> listeResa;
	
//	@OneToMany
//	@JoinColumn(name="")
//	private List<Reservation> listeResa;
	
	public Agence() {
		// TODO Auto-generated constructor stub
	}

	public Agence(Long idAgence, String nomAgence, String adresse, String mail, String telephone) {
		super();
		this.idAgence = idAgence;
		this.nomAgence = nomAgence;
		this.adresse = adresse;
		this.mail = mail;
		this.telephone = telephone;
	}

	public Agence(String nomAgence, String adresse, String mail, String telephone) {
		super();
		this.nomAgence = nomAgence;
		this.adresse = adresse;
		this.mail = mail;
		this.telephone = telephone;
	}

	public Long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}

	public List<Facture> getListeFacture() {
		return listeFacture;
	}

	public void setListeFacture(List<Facture> listeFacture) {
		this.listeFacture = listeFacture;
	}

	public List<Voiture> getListeVoiture() {
		return listeVoiture;
	}

	public void setListeVoiture(List<Voiture> listeVoiture) {
		this.listeVoiture = listeVoiture;
	}

	public List<Reservation> getListeResa() {
		return listeResa;
	}

	public void setListeResa(List<Reservation> listeResa) {
		this.listeResa = listeResa;
	}
	
	
}
