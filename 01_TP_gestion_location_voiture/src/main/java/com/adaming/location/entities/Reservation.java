package com.adaming.location.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReservation;
	private Date dateDebut;
	private Date dateFin;
	private Double totalReservation;
	
	@ManyToOne
	@JoinColumn(name="voiture_id")
	private Voiture voiture;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	
	@OneToOne(mappedBy="resa")
	private Facture facture;
	
	//private Agence agence;
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public Reservation(Long idReservation, Date dateDebut, Date dateFin) {
		super();
		this.idReservation = idReservation;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Reservation(Date dateDebut, Date dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Double getTotalReservation() {
		return totalReservation;
	}

	public void setTotalReservation(Double totalReservation) {
		this.totalReservation = totalReservation;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

//	public Agence getAgence() {
//		return agence;
//	}
//
//	public void setAgence(Agence agence) {
//		this.agence = agence;
//	}
	
	
}
