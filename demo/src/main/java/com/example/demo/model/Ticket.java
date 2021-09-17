package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue
	@Column(unique = true, nullable = false)
	private int IdTicket;
	private int numeroVenta;
	public int getIdTicket() {
		return IdTicket;
	}
	public void setIdTicket(int idTicket) {
		IdTicket = idTicket;
	}
	public int getNumeroVenta() {
		return numeroVenta;
	}
	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}
	@Override
	public String toString() {
		return "Ticket [IdTicket=" + IdTicket + ", numeroVenta=" + numeroVenta + "]";
	}
	
	

}
