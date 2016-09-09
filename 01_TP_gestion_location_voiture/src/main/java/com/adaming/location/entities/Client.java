package com.adaming.location.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	private String adresse;
	private String mail;
	private Date dateNaissance;
	private Date datePermis;
	private String telephone;
	
	@OneToMany(mappedBy="client")
	private List<Reservation> listeResa;

	public Client() {
		super();
	}

	public Client(Long idClient, String nomClient, String prenomClient, String adresse, String mail, Date dateNaissance,
			Date datePermis, String telephone) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.adresse = adresse;
		this.mail = mail;
		this.dateNaissance = dateNaissance;
		this.datePermis = datePermis;
		this.telephone = telephone;
	}

	public Client(String nomClient, String prenomClient, String adresse, String mail, Date dateNaissance,
			Date datePermis, String telephone) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.adresse = adresse;
		this.mail = mail;
		this.dateNaissance = dateNaissance;
		this.datePermis = datePermis;
		this.telephone = telephone;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDatePermis() {
		return datePermis;
	}

	public void setDatePermis(Date datePermis) {
		this.datePermis = datePermis;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Reservation> getListeResa() {
		return listeResa;
	}

	public void setListeResa(List<Reservation> listeResa) {
		this.listeResa = listeResa;
	}
	
	
}
