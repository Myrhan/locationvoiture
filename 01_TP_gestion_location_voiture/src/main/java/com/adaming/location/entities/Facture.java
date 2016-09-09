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
public class Facture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFacture;
	private Date dateFacturation;
	
	@OneToOne
	@JoinColumn(name="resa_id")
	private Reservation resa;
	
	@ManyToOne
	@JoinColumn(name="agence_id")
	private Agence agence;
	
	public Facture() {
		// TODO Auto-generated constructor stub
	}

	public Facture(Long idFacture, Date dateFacturation) {
		super();
		this.idFacture = idFacture;
		this.dateFacturation = dateFacturation;
	}

	public Facture(Date dateFacturation) {
		super();
		this.dateFacturation = dateFacturation;
	}

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public Date getDateFacturation() {
		return dateFacturation;
	}

	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}

	public Reservation getResa() {
		return resa;
	}

	public void setResa(Reservation resa) {
		this.resa = resa;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
	
}
